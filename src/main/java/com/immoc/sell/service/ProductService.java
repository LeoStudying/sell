package com.immoc.sell.service;

import com.immoc.sell.dataobject.ProductCategory;
import com.immoc.sell.dataobject.ProductInfo;
import com.immoc.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 描述:
 * 商品service接口
 *
 * @outhor Leo
 * @create 2018-02-10 下午 10:15
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);

}