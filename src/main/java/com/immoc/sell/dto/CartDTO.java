package com.immoc.sell.dto;

import lombok.Data;

/**
 * 描述:
 * 购物车数据传输对象
 *
 * @outhor Leo
 * @create 2018-03-04 下午 2:30
 */
@Data
public class CartDTO {

    /** 商品Id */
    private String productId;

    /** 商品数量 */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}