package com.java_basic.javabasic_codingbat;

import java.util.HashMap;
import java.util.Map;

//Map-2 allSwap

public class Second {

    public String[] allSwap(String[] strings) {
        Map<Character, Integer> swiped = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {                      //Перебираем переданный массив
            if (!swiped.containsKey(strings[i].charAt(0))) {            //Проверка, содержит ли мапа ключ с первой буквой взятого стринга
                swiped.put(strings[i].charAt(0), i);                    //Добавить в мапу если такого ключа нет
            } else {
                String tmp = strings[swiped.get(strings[i].charAt(0))];           //Схранение первого стринга во временную переменную
                strings[swiped.get(strings[i].charAt(0))] = strings[i];           //Запись второго стринга на место первого
                strings[i] = tmp;                                                 //Запись временного (первого) на место второго
                swiped.remove((strings[i].charAt(0)));                            //Удаление из мапы пары с данным ключом
            }
        }
        return strings;
    }
}
