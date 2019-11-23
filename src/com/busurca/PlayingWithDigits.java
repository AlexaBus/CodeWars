package com.busurca;

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

}
