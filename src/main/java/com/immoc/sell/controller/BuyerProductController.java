package com.immoc.sell.controller;

import com.immoc.sell.VO.ProductInfoVo;
import com.immoc.sell.VO.ProductVo;
import com.immoc.sell.VO.ResultVo;
import com.immoc.sell.dataobject.ProductCategory;
import com.immoc.sell.dataobject.ProductInfo;
import com.immoc.sell.service.ProductCategoryService;
import com.immoc.sell.service.ProductService;
import com.immoc.sell.utils.ResultVoUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 描述:
 * 买家商品Controller
 *
 * @outhor Leo
 * @create 2018-02-11 下午 1:30
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping("/list")
    public ResultVo list() {
        //1, 查询所有的上架商品
        List<ProductInfo> productInfoList = productService.findUpAll();

        //2, 查询类目(一次性查询)
        //List<Integer> categoryTypeList = new ArrayList<>();
        //传统方法
        /*for (ProductInfo productInfo:productInfoList) {
            categoryTypeList.add(productInfo.getCategoryType());
        }*/
        //精简方法(java8, lamda)
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(e -> e.getCategoryType())
                .collect(Collectors.toList());

        List<ProductCategory> productCategoryList  = productCategoryService.findByCategoryTypeIn(categoryTypeList);

        //3,数据拼装
        List<ProductVo> productVoList = new ArrayList<ProductVo>();
        for (ProductCategory productCategory : productCategoryList) {
            ProductVo productVo = new ProductVo();
            productVo.setCategoryType(productCategory.getCategoryType());
            productVo.setCategoryName(productCategory.getCategoryName());

            List<ProductInfoVo> productInfoVoList = new ArrayList<ProductInfoVo>();
            for (ProductInfo productInfo :productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVo productInfoVo = new ProductInfoVo();
                    BeanUtils.copyProperties(productInfo, productInfoVo);
                    productInfoVoList.add(productInfoVo);
                }
            }
            productVo.setProductInfoVoList(productInfoVoList);
            productVoList.add(productVo);

        }

        /*ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMsg("成功");
        resultVo.setData(productVoList);
        return resultVo;*/

        return ResultVoUtils.success(productVoList);

    }

}