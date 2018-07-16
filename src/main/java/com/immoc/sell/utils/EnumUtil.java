package com.immoc.sell.utils;

import com.immoc.sell.enums.CodeEnum;

/**
 * 描述:
 * 枚举工具类
 *
 * @outhor Leo
 * @create 2018-04-02 下午 10:58
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }

}