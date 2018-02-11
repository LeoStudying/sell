package com.immoc.sell.utils;

import com.immoc.sell.VO.ResultVo;

/**
 * 描述:
 * ResultVo工具类
 *
 * @outhor Leo
 * @create 2018-02-11 下午 4:01
 */
public class ResultVoUtils {

    public static ResultVo success (Object object) {
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMsg("成功");
        resultVo.setData(object);
        return resultVo;
    }

    public static ResultVo success () {
        return success(null);
    }

    public static ResultVo error (Integer code, String msg) {
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(code);
        resultVo.setMsg(msg);
        return resultVo;
    }

}