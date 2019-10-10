package com.busurca;

class Dubstep {

    String SongDecoder(String song) {

        //use a string builder for the append method
        StringBuilder actualSong = new StringBuilder();

        //put not wub words in an array
        String[] withoutWub = song.split("WUB");

        //print each word in tha array and a space after except for the last one
        for (int i = 0; i < withoutWub.length; i++) {
            if (!withoutWub[i].equals("")) {
                actualSong.append(withoutWub[i]);
                if(i!=withoutWub.length-1){
                    actualSong.append(" ");
                }

            }
        }

        return actualSong.toString();
    }

}
