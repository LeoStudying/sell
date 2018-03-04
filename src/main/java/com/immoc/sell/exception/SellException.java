package com.immoc.sell.exception;

import com.immoc.sell.enums.ResultEnum;

/**
 * 描述:
 * 异常
 *
 * @outhor Leo
 * @create 2018-03-04 下午 1:51
 */
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }

}