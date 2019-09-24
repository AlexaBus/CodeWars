package com.busurca;

import java.util.Arrays;
import java.util.stream.Stream;

public class DetectPangram {

    boolean check(String sentence){

        int[] alphabet = new int[26];

        for (int i = 0; i<alphabet.length; i++) {
            int j = i + 97;
            alphabet[i] = j;
        }

        System.out.println(Arrays.toString(alphabet));

        int[] lettersInSentence = new int[26];

        for(int i = 0; i < lettersInSentence.length; i++) {
                if (Character.isAlphabetic(sentence.toLowerCase().toCharArray()[i])){
                    lettersInSentence[i]=sentence.toLowerCase().toCharArray()[i];
                }
        }

        System.out.println(Arrays.toString(lettersInSentence));


        return Arrays.equals(alphabet,lettersInSentence);
    }

}
