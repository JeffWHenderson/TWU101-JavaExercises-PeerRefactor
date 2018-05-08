package com.thoughtworks.tw101.exercises.exercise7;
import java.util.Scanner;

public class GuessingGame {
    boolean userWon = false;
    int lowerLimit, upperLimit, userGuess;


    public void play(int lowerLimit, int upperLimit) {
        userWon = false;
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        int randomNumber = GetRandomNumber();

        System.out.println("Let's play a game (Jigsaw voice)");
        System.out.println("Guess a random number between "+lowerLimit+" and "+upperLimit+" \n");
        Scanner reader = new Scanner(System.in);

        while (!userWon) {
            System.out.println("Please enter your guess:");
            userGuess = reader.nextInt();

            if(userGuess == randomNumber) {
                userWon = true;
                System.out.println("You guessed correct!\n");
            } else if (userGuess > randomNumber) {
                System.out.println("TOO HIGH!, try again!\n");
            } else {
                System.out.println("TOO LOW!, try again!\n");
            }
        }

        reader.close();
    }

    private int GetRandomNumber() {
        return (int) (Math.random() * (upperLimit - lowerLimit)) + lowerLimit;
    }



}
