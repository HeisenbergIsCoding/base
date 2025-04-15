package com.person.common.utils;

/**
 * 字串處理工具類
 * 提供常用字串相關靜態方法
 */
public class StringUtils {
    /**
     * 判斷字串是否為空（null 或長度為0）
     */
    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    /**
     * 將字串首字母轉大寫
     */
    public static String capitalize(String str) {
        if (isEmpty(str)) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
