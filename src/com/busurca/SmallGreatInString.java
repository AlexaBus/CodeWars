package com.busurca;

class SmallGreatInString {

    String highAndLow(String numbers) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        String[] string = numbers.split(" ");
        for (String s : string) {

            if (Integer.parseInt(s) < min) min = Integer.parseInt(s);
            if (Integer.parseInt(s) > max) max = Integer.parseInt(s);

        }

        return max + " " + min;

    }

}
