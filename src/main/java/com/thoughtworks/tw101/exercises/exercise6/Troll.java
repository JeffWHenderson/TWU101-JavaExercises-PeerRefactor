package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {
    int hitPoints;
    String name;

    public Troll() {
        this.name = "Troll";
        this.hitPoints = 40;
    }

    @Override
    public void reportStatus() {
        System.out.println(name+ " has "+hitPoints+ " hitpoints remaining");
    }

    @Override
    public void takeDamage(int amount) {
        //Take 1/2 damage
        hitPoints -= amount / 2;
    }
}
