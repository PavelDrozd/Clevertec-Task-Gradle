package com.clevertec;

public class StringUtils {

    public static boolean isPositiveNumber(String str) {
        long number = Long.parseLong(str);
        return number > 0;
    }
}
