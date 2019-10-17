package com.busurca;

public class Main {

    public static void main(String[] args) {

        FindOdd fo = new FindOdd();
        int i = fo.findOddInt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5});

        System.out.println(i);

    }
}
