package com.immoc.sell.utils;

import java.util.Random;

/**
 * 描述:
 * KeyUtil
 *
 * @outhor Leo
 * @create 2018-03-04 下午 2:10
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式: 时间+六位随机数
     * @Retrun
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();

        //生成六位随机数
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }


}