package com.person.common.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * 集合工具類
 */
public class CollectionUtils {
    /**
     * 判斷集合是否為空
     */
    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    /**
     * 合併兩個集合並去重
     */
    public static <T> Set<T> mergeAndDistinct(Collection<T> a, Collection<T> b) {
        Set<T> result = new HashSet<>();
        if (a != null) result.addAll(a);
        if (b != null) result.addAll(b);
        return result;
    }
}
