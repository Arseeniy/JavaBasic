package com.java_basic.javabasic_codingbat;

//Logic-2 makeBricks

public class Third {

    public static boolean makeBricks(int small, int big, int goal) {
        int smallSize = 1;
        int bigSize = 5;
        boolean result = false;
        if (small * smallSize >= goal || big * bigSize == goal || big * bigSize + small * smallSize == goal) {
            return result = true;
        }
        if (big > 0) {
            int timer = 1;
            while (timer <= big) {
                if (timer * bigSize == goal) {
                    return result = true;
                }
                timer++;
            }
        }
        if (big > 0) {
            int timer = 1;
            while (timer <= big) {
                if ((goal - timer * bigSize) > 0 && (goal - timer * bigSize) <= small * smallSize) {
                    return result = true;
                }
                timer++;
            }
        }
        return result;
    }
}