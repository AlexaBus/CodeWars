package com.busurca;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = SortOddsOnlyV3.sortArray(new int[]{0, 0, 2, 1, 5, 111, 111, 11, 2, 11, 2, 2, 1, 2, 5, 5, 4, 3, 71, 71, 91, 0, 0, 101, 100, 4, 7, 15, 15, 15, 0});
        System.out.println("original " + Arrays.toString( new int[]{0, 0, 2, 1, 5, 111, 111, 11, 2, 11, 2, 2, 1, 2, 5, 5, 4, 3, 71, 71, 91, 0, 0, 101, 100, 4, 7, 15, 15, 15, 0}));
        System.out.println("oddSorted" + Arrays.toString(array));

    }
}
