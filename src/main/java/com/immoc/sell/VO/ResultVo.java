package com.immoc.sell.VO;

import lombok.Data;

/**
 * 描述:
 * http请求返回的最外层对象
 *
 * @outhor Leo
 * @create 2018-02-11 下午 1:36
 */
@Data
public class ResultVo<T> {

    private Integer code;

    private String msg;

    private T data;


}