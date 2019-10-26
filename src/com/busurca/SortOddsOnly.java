package com.busurca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SortOddsOnly {

    static int[] sortArray(int[] array) {

        if (array.length == 0) {
            return array;
        }

        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();
        Map<Integer, Integer> indexValue = new HashMap<>();

        for (int i : array) {
            if (i % 2 != 0) {
                odds.add(i);
            } else if (!evens.contains(i)) {
                evens.add(i);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (Integer x : evens) {
                if (x.equals(array[i])) {
                    indexValue.put(i, x);
                }
            }
        }

        System.out.println("indexValue " + indexValue);


        odds.sort(Integer::compareTo);

        for (Map.Entry<Integer, Integer> set : indexValue.entrySet()) {
            odds.add(set.getKey(), set.getValue());
        }

        int[] newArray = new int[array.length];

        for (int i = 0; i <= odds.size() - 1; i++) {
            newArray[i] = odds.get(i);
        }

        return newArray;
    }

}
