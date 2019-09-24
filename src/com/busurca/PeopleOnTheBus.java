package com.busurca;

import java.util.ArrayList;

public class PeopleOnTheBus {

    public int countPassengers(ArrayList<int[]> stops) {
        int countOfPassengers = 0;
        for (int[] array : stops
        ) {
            countOfPassengers = countOfPassengers + array[0] - array[1];
        }
        return countOfPassengers;
    }

}
