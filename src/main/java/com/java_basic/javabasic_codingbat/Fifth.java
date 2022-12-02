package com.java_basic.javabasic_codingbat;

//Array-3 > maxSpan

public class Fifth {
    public int maxSpan(int[] nums) {
        int firstIndex;
        int lastIndex = 0;
        int span = 0;
        for (int i = 0; i < nums.length; i++) {
            firstIndex = i;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    lastIndex = j;
                }
            }
            int tmpSpan = lastIndex - firstIndex + 1;
            if (tmpSpan > span) {
                span = tmpSpan;
            }
        }
        return span;
    }
}
