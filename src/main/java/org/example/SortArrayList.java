package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortArrayList {
    static Map<Integer, Integer> sortList(List<Integer> list){
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer number : list) {
            Integer n = map.get(number);
            if (n == null) {
                map.put(number, 1);
            } else {
                map.put(number, n+1);
            }
        }
        return map;
    }
}
