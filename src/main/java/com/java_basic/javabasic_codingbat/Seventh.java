package com.java_basic.javabasic_codingbat;

//Functional-2 > noNeg

import java.util.List;

public class Seventh {
    public List<Integer> noNeg(List<Integer> nums) {
            nums.removeIf(n -> n < 0);
        return nums;
    }
}
