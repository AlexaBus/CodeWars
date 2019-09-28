package com.busurca;

import java.util.Arrays;

public class FindStray {

    //my solution
    int stray(int[] numbers) {

        for (int i = 1; i < numbers.length-1 ; i++) {

            if(numbers[i]!=numbers[i-1]&&numbers[i]!=numbers[i+1]) {
                return numbers[i];
            } else if(numbers[i]!=numbers[i-1]&&numbers[i]==numbers[i+1]) {
                return numbers[i-1];
            } else if(numbers[i]==numbers[i-1]&&numbers[i]!=numbers[i+1]) {
                return numbers[i+1];
            }

        }

        return 0;
    }

    //other solutions i liked
    int straySecond(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0] == numbers[1] ? numbers[numbers.length-1] : numbers[0];
    }

    int strayThird(int[] numbers) {
        if (numbers[0] != numbers[1] && numbers[0] != numbers[2]) return numbers[0];
        for (int i : numbers) if (i != numbers[0]) return i;
        return 0;
    }

    int strayFourth(int[] numbers) {

        int x = 0;
        for (int n: numbers) {
            x = x^n;
        }

        return x;
    }

}
