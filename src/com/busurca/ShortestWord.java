package com.busurca;

import java.util.stream.Stream;

class ShortestWord {

    int findShort(String s) {

        String[] stringArray = s.split(" ");

        int shortestStringLength = stringArray[0].length();

        for (int i = 0; i < stringArray.length - 1; i++) {
            if (shortestStringLength > stringArray[i + 1].length()) {
                shortestStringLength = stringArray[i + 1].length();
            }
        }

        return shortestStringLength;
    }

    int bestFindShort(String s) {

        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();

    }

}
