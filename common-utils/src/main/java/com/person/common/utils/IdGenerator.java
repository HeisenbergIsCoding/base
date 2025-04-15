package com.person.common.utils;

import java.util.UUID;

/**
 * 唯一識別碼產生工具
 */
public class IdGenerator {
    /**
     * 產生標準 UUID
     */
    public static String uuid() {
        return UUID.randomUUID().toString();
    }

    /**
     * 產生無連字符號的短 UUID
     */
    public static String shortUuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
