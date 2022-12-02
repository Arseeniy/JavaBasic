package com.java_basic.javabasic_codingbat;

//Warmup 2 - stringTimes

public class First {

    public String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n ; i++) {
            result += str;
        }
        return result;
    }
}
