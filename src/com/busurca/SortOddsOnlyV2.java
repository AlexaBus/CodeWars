//given an array with integer numbers,
//sort only the odds keeping even numbers in their place

package com.busurca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortOddsOnlyV2 {

    static int[] sortArray(int[] array) {

        //if the array is empty, return it
        if (array.length == 0) {
            return array;
        }

        //put the array into a list
        List<Integer> myList = new ArrayList<>(array.length);
        for (int i : array) {
            myList.add(i);
        }

        //remember the indexes and values of the even integers
        Map<Integer, Integer> indexValue = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            for (Integer x : myList) {
                if (x % 2 == 0 && x.equals(array[i])) {
                    indexValue.put(i, x);
                }
            }
        }

        System.out.println(indexValue);

        //sort the whole list of integers
        myList.sort(Integer::compareTo);

        //remove even integers
        for (Integer i : indexValue.values()) {
            if (i % 2 == 0) {
                myList.remove(i);
            }
        }

        //add even integers in their original index
        //for (Map.Entry<Integer, Integer> set : indexValue.entrySet()) {
          //  myList.add(set.getKey(), set.getValue());
        //}

        //move the array list to an array as required
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (Map.Entry<Integer, Integer> set : indexValue.entrySet()) {
                if(i == set.getKey()) {
                    newArray[i] = set.getValue();
                }
            }
            newArray[i] = myList.get(i);
        }

        return newArray;
    }
}
