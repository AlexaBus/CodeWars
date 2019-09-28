package com.busurca;

public class Main {

    public static void main(String[] args) {

        Fighter busu = new Fighter("busu", 10000, 251);
        Fighter alex = new Fighter("alex", 10000, 250);

        WeHaveAWinner newFight = new WeHaveAWinner();

        System.out.println(newFight.declareWinner(busu, alex, "busu"));
        busu.health=10000;
        alex.health=10000;
        System.out.println(newFight.betterWayToDeclareAWinner(busu,alex,"busu"));

    }
}
