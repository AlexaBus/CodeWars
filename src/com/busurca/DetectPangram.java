package com.busurca;

public class DetectPangram {

    boolean check(String sentence) {

        //char array containing lower letters
        char[] alphabet = {97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

        //for each alphabet letter check if it exists in the given string
        for (int i = 0; i < alphabet.length; i++) {
            //if it doesn't exist return false
            if (sentence.toLowerCase().indexOf(alphabet[i]) == -1) {
                return false;
            }
        }

        return true;
    }

    //these 2 are other solutions that i liked
    public boolean secondCheck(String sentence) {
        for (char c = 'a'; c <= 'z'; c++)
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;
    }

    public boolean thirdCheck(String sentence) {

        return sentence.chars().filter(Character::isAlphabetic).map(Character::toLowerCase).distinct().count() == 26;

    }

}
