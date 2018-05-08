package com.thoughtworks.tw101.exercises.exercise6;

// Exercise #6: Create Orc and Troll classes that implement a Monster interface with takeDamage(int amount),
// reportStatus methods. Create instances of both classes and store them in an ArrayList.
// Iterate through the list and make each monster take 10 points of damage. After you have damaged all of the monsters,
// report the status of all monsters using a void reportStatus() method. ReportStatus should print the name and current hit 
// points of the monster.
// * Orcs are named “Orc” and have 20 initial hitpoints
// * Trolls are named “Troll”, have 40 hit points and only take half damage

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Monster> monsters = new ArrayList<Monster>();

        Orc orc1 = new Orc();
        Orc orc2 = new Orc();
        Orc orc3 = new Orc();

        Troll troll1 = new Troll();
        Troll troll2 = new Troll();
        Troll troll3 = new Troll();

        monsters.add(orc1);
        monsters.add(orc2);
        monsters.add(orc3);
        monsters.add(troll1);
        monsters.add(troll2);
        monsters.add(troll3);

        for (Monster monster: monsters) {
            monster.takeDamage(10);
            monster.reportStatus();
        }
    }
}
