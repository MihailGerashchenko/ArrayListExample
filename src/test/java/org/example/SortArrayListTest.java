package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayListTest {


    @Test
    @DisplayName("To test and compare ArrayList")
    void testSortList() {
        Integer[] array = new Integer[]{4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7};
        List<Integer> list = Arrays.asList(array);

        Map<Integer, Integer> listComparison = new HashMap<>();
        listComparison.put(2, 1);
        listComparison.put(3, 1);
        listComparison.put(4, 4);
        listComparison.put(5, 3);
        listComparison.put(-6, 1);
        listComparison.put(7, 1);

        assertEquals(listComparison, SortArrayList.sortList(list));
    }
}