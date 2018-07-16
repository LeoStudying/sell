package com.immoc.sell.enums;

import lombok.Getter;

/**
 * 描述:
 * 商品状态
 *
 * @outhor Leo
 * @create 2018-02-10 下午 10:47
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "上架商品"),
    Down(1, "下架商品")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}