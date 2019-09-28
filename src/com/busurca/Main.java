package com.busurca;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class Main {

    public static void main(String[] args) {

        FindStray fs = new FindStray();

        long startTime = System.nanoTime();
        System.out.println(fs.stray(new int[]{17, 17, 3, 17, 17, 17, 17}));
        long endTime = System.nanoTime();

        long durationMySolution = (endTime - startTime);
        System.out.println(durationMySolution);

        startTime = System.nanoTime();
        System.out.println(fs.straySecond(new int[]{17, 17, 3, 17, 17, 17, 17}));
        endTime = System.nanoTime();

        long durationSortSolution = (endTime - startTime);
        System.out.println(durationSortSolution);

        startTime = System.nanoTime();
        System.out.println(fs.strayThird(new int[]{17, 17, 3, 17, 17, 17, 17}));
        endTime = System.nanoTime();

        long durationThirdSolution = (endTime - startTime);
        System.out.println(durationThirdSolution);

        startTime = System.nanoTime();
        System.out.println(fs.strayFourth(new int[]{17, 17, 3, 17, 17, 17, 17}));
        endTime = System.nanoTime();

        long durationFourthSolution = (endTime - startTime);
        System.out.println(durationFourthSolution);

    }
}
