package com.busurca;

class SumArrayElem {

    int findEvenIndex(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int j = 0; j < i; j++) {
                sumLeft += arr[j];
            }

            for (int k = i; k < arr.length - 1; k++) {
                sumRight += arr[k + 1];
            }

            if (sumLeft == sumRight) return i;
        }

        //if no index satisfies the requirement
        return -1;
    }

}


