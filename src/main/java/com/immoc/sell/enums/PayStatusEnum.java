package com.immoc.sell.enums;

import lombok.Getter;

/**
 * 描述:
 * 支付枚举
 *
 * @outhor Leo
 * @create 2018-02-27 下午 9:36
 */
@Getter
public enum PayStatusEnum implements CodeEnum{

    WAIT(0, "未支付"),
    SUCCESS(1, "支付成功")
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}