package com.busurca;

class Isograms {

    boolean isIsogram(String str) {

        for (char letter: str.toLowerCase().toCharArray()
        ) {
            for (int i = str.toLowerCase().indexOf(letter); i < str.toCharArray().length-1; i++) {
                char compareWithLetter = str.toLowerCase().charAt(i+1);
                if (letter == compareWithLetter) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean differentIsIsogram(String str){
        return str.length()==str.toLowerCase().chars().distinct().count();
    }

}
