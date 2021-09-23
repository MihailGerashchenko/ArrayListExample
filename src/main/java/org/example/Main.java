package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7};
        List<Integer> list = Arrays.asList(array);
        System.out.println(SortArrayList.sortList(list));

        ListWithoutRemoval<String> undeletedElementList = new ListWithoutRemoval<>();
        String one = "You are";
        String two = "not allowed";
        String three = "to remove";

        undeletedElementList.add(one);
        undeletedElementList.add(two);
        undeletedElementList.add(three);
        System.out.println(undeletedElementList);

        undeletedElementList.removeAll(undeletedElementList);
        undeletedElementList.remove(1);
        undeletedElementList.clear();
        undeletedElementList.remove(one);
        undeletedElementList.removeRange(0, 2);
    }
}
