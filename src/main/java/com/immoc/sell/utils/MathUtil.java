package com.immoc.sell.utils;

/**
 * 描述:
 * 数学工具类
 *
 * @outhor Leo
 * @create 2018-03-11 下午 9:21
 */
public class MathUtil {

    private static final Double MONEY_RANGE = 0.01;

    /**
     * 比较2个金额是否相等
     * @param d1
     * @param d2
     * @return
     */
    public static Boolean equals(Double d1, Double d2) {
        Double result = Math.abs(d1 - d2);
        if (result < MONEY_RANGE) {
            return true;
        }else {
            return false;
        }
    }

}