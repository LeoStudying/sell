package com.immoc.sell.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 描述:
 * json工具类
 *
 * @outhor Leo
 * @create 2018-03-11 下午 7:46
 */
public class JsonUtil {

    public static String toJson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }

}