package com.busurca;

import java.util.stream.IntStream;

class PlayingWithDigits {

    static long digPow(int n, int p) {

        //get each digit of the given number and store it in a char array
        char[] digits = String.valueOf(n).toCharArray();

        //will hold the sum of the powered up digits
        double sumOfPoweredDigits = 0;

        //loop trough the digits, power them up and add the result
        for (int i = 0; i < digits.length; i++) {
            sumOfPoweredDigits += Math.pow(Character.getNumericValue(digits[i]), p + i);
            System.out.println(sumOfPoweredDigits);
        }

        //if it exists return the required result
        if (sumOfPoweredDigits % n == 0) {
            return (long)sumOfPoweredDigits/n;
        }

        return -1;
    }

    //i like this one because it shows the use of Streams
    // how to get an int array before looping,
    // instead of looping through a char array and then change it to an int value
    public static long digPow2(int n, int p) {
        int[] digits = String.valueOf(n).chars().map(Character::getNumericValue).toArray();
        int sum = IntStream.range(0, digits.length).map(i -> (int) Math.pow(digits[i], i + p)).sum();
        return sum % n == 0 ? sum / n : -1;

    }

}




