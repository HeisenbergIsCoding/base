package com.person.common.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * JSON 處理工具類
 */
public class JsonUtils {
    private static final ObjectMapper mapper = new ObjectMapper();

    /**
     * 將物件轉換為 JSON 字串
     */
    public static String toJson(Object obj) {
        try {
            return mapper.writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException("轉換為 JSON 失敗", e);
        }
    }

    /**
     * 將 JSON 字串轉為指定型別物件
     */
    public static <T> T fromJson(String json, Class<T> clazz) {
        try {
            return mapper.readValue(json, clazz);
        } catch (Exception e) {
            throw new RuntimeException("解析 JSON 失敗", e);
        }
    }
}
