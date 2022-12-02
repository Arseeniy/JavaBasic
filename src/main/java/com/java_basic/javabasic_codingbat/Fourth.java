package com.java_basic.javabasic_codingbat;

//String-2 - countHi

public class Fourth {
    public int countHi(String str) {
        int count = 0;
        int startPoint = 0;
        while (true) {
            int index = str.indexOf("hi", startPoint);
            if (index >= 0) {
                startPoint = index + 1;
                count++;
            }else {
                break;
            }
        }
        return count;
    }
}
