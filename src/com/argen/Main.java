package com.argen;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HavingSuperAbility[] havingSuperAbilities = {new Magic(), new Medic(), new Warrior()};
        for (int i = 0; i < havingSuperAbilities.length; i++) {
            System.out.println(havingSuperAbilities[2].applySuperAbility("Critical damage"));
        }



    }

}

