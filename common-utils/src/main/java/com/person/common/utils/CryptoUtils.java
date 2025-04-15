package com.person.common.utils;

import java.security.MessageDigest;
import java.util.Base64;

/**
 * 加密與雜湊工具類
 */
public class CryptoUtils {
    /**
     * 取得字串的 SHA-256 雜湊值
     */
    public static String sha256(String str) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(str.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Base64 編碼
     */
    public static String base64Encode(String str) {
        return Base64.getEncoder().encodeToString(str.getBytes());
    }

    /**
     * Base64 解碼
     */
    public static String base64Decode(String base64Str) {
        return new String(Base64.getDecoder().decode(base64Str));
    }
}
