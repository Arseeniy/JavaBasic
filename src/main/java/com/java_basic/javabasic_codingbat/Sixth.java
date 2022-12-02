package com.java_basic.javabasic_codingbat;

//String-3 > withoutString

public class Sixth {
    public static String withoutString(String base, String remove) {
        if (remove.length() > 0 && remove.length() < base.length()) {
            base = base.replaceAll("(?i)\\Q" + remove + "\\E", "");
        }
        return base;
    }
}
