package com.busurca;

class FindOdd {

    int findOddInt(int[] a) {

        //for each integer in the array
        for (int i : a) {
            int count = 0;

            //check if it equals each array element
            for(int s = 0; s<=a.length-1;s++){

                //increase count if it does
                if(i == a[s]){
                    count++;
                }
            }

            //if count is odd return current integer in the array
            if(count%2!=0){
                return i;
            }
        }

        return 0;
    }

    //codewars solution using XOR
    int findIt(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }
        return xor;
    }

}
