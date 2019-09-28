package com.busurca;

class WeHaveAWinner {


    String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        //first attacker is fighter 1
        if (firstAttacker.equals(fighter1.name)) {

            while (fighter1.health > 0 && fighter2.health > 0) {

                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <= 0) {
                    return fighter1.name;
                }
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <= 0) {
                    return fighter2.name;
                }

            }

        }

        //first attacker is fighter 2
        if (firstAttacker.equals(fighter2.name)) {

            while (fighter1.health > 0 && fighter2.health > 0) {

                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <= 0) {
                    return fighter2.name;
                }
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <= 0) {
                    return fighter1.name;
                }

            }

        }
        return "oops!";
    }

    String betterWayToDeclareAWinner(Fighter f1, Fighter f2, String firstAttacker) {
        int f1NoOfStrikes = (int) Math.ceil((double) f2.health / f1.damagePerAttack);
        System.out.println((double)(f2.health / f1.damagePerAttack));
        int f2NoOfStrikes = (int) Math.ceil((double) f1.health / f2.damagePerAttack);
        System.out.println((double)(f1.health / f2.damagePerAttack));
        if (f1NoOfStrikes > f2NoOfStrikes) {
            return f1.name;
        } else if (f2NoOfStrikes > f1NoOfStrikes) {
            return f2.name;
        } else {
            return firstAttacker;
        }
    }

}
