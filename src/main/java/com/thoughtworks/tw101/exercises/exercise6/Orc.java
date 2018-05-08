package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster {
    int hitPoints;
    String name;

    public Orc() {
        name = "Orc";
        hitPoints = 20;
    }

    @Override
    public void reportStatus() {
        System.out.println(name+ " has "+hitPoints+ " hitpoints remaining");
    }

    @Override
    public void takeDamage(int amount) {
        hitPoints -= amount;
    }
}
