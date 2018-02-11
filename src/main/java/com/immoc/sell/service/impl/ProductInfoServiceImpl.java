package com.immoc.sell.service.impl;

import com.immoc.sell.dataobject.ProductInfo;
import com.immoc.sell.enums.ProductStatusEnum;
import com.immoc.sell.repository.ProductInfoRspository;
import com.immoc.sell.service.ProductCategoryService;
import com.immoc.sell.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述:
 * 商品service实现类
 *
 * @outhor Leo
 * @create 2018-02-10 下午 10:17
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoRspository productInfoRspository;


    @Override
    public ProductInfo findOne(String productId) {
        return productInfoRspository.findOne(productId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRspository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return productInfoRspository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return productInfoRspository.save(productInfo);
    }
}