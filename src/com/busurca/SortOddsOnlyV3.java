//this was a challenge, it took 2-3 days to solve.
//had to google some stuff: iterators, hash maps
//and needed 2 other version until it connected

//given an array with integer numbers,
//sort only the odds keeping even numbers in their place

package com.busurca;

import java.util.*;

public class SortOddsOnlyV3 {

    static int[] sortArray(int[] array) {

        //if the array is empty, return it
        if (array.length == 0) {
            return array;
        }

        //transform the array in a list which, in the end will hold sorted odds
        List<Integer> myList = new ArrayList<>(array.length);
        for (int i : array) {
            myList.add(i);
        }

        //i need a hash map for the evens so i can store them and their indexes
        Map<Integer, Integer> evensIndexes = new HashMap<>();
        //i need a new array to hold the result
        int[] result = new int[array.length];

        //put evens and their indexes in the hash map
        for (int i = 0; i < array.length; i++) {
            for (Integer x : myList) {
                if (x % 2 == 0 && x.equals(array[i])) {
                    evensIndexes.put(i, x);
                }
            }
        }

        System.out.println("evensIndexes " + evensIndexes);

        //sort the list and remove evens
        myList.sort(Integer::compareTo);

        for (Integer i : evensIndexes.values()) {
            myList.remove(i);
        }

        //put evens from the hash map into the result array
        for (int i = 0; i < result.length; i++) {
            for (Map.Entry<Integer, Integer> set : evensIndexes.entrySet()) {
                if (i == set.getKey()) {
                    result[i] = set.getValue();
                    break;
                }
            }
        }

        System.out.println("result after evens added " + Arrays.toString(result));

        //use an iterator to get odd values from the list and add them in the result array
        Iterator<Integer> odd = myList.iterator();

        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0 && array[i] != 0) {
                while (odd.hasNext()) {
                    result[i] = odd.next();
                    odd.remove();
                    break;
                }
            }
        }

        return result;

    }

    //other better/interesting solutions
    public static int[] sortArray2(final int[] array) {

        // Sort the odd numbers only
        final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();

        // Then merge them back into original array
        for (int j = 0, s = 0; j < array.length; j++) {
            if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
        }

        return array;
    }

    //i liked this one because it solved the request using simple array only
    public static int[] sortArray3(int[] array) {
        for(int i=0 ; i<array.length-1 ; i++){
            for(int j=i+1; j<array.length ; j++){
                if(array[i]>array[j] && array[i]%2 == 1 && array[j]%2 == 1){
                    int aux=array[i];
                    array[i]=array[j];
                    array[j]=aux;
                }
            }
        }
        return array;
    }

}
