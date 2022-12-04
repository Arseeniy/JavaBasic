package com.java_basic.javabasic_codingbat;

//String-3 > maxBlock

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Eighth {
    public int maxBlock(String str) {
        List<String> letters = new ArrayList<>(Arrays.asList(str.split("")));
        int finalCount = 0;
        int tempCount = 0;
        String startLetter = letters.get(0);
        String continueLetter = "";
        Iterator<String> iterator = letters.iterator();
        while (iterator.hasNext() && !str.equals("")) {
            continueLetter = iterator.next();
            if (continueLetter.equals(startLetter)) {
                tempCount++;
            } else {
                startLetter = continueLetter;
                if (tempCount > finalCount) {
                    finalCount = tempCount;
                }
                tempCount = 1;
            }
        }
        if (tempCount > finalCount && letters.size() > 0) {
            finalCount = tempCount;
        }
        return finalCount;
    }
}
