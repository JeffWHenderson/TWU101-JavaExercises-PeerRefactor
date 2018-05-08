package com.thoughtworks.tw101.exercises.exercise8;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessingGame {
    boolean userWon = false;
    int lowerLimit, upperLimit, userGuess, randomNumber;
    ArrayList<Integer> allGuessesList;

    public GuessingGame() {
        allGuessesList = new ArrayList<>();
    }


    public void play(int lowerLimit, int upperLimit) throws NumberFormatException {
        resetGame(lowerLimit, upperLimit);

        System.out.println("Let's play a game (Jigsaw voice)");
        System.out.println("Guess a random number between "+lowerLimit+" and "+upperLimit+" \n");
        Scanner reader = new Scanner(System.in);

        try {
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

                allGuessesList.add(userGuess);
            }
        } catch (NumberFormatException e) {
            System.out.print("Guesses can only be numbers ! (Jigsaw voice)\n");
        } catch (InputMismatchException e) {
            System.out.print("Guesses can only be numbers ! (Jigsaw voice\n");
        }

        reader.close();

        System.out.println("You guessed "+allGuessesList.size()+ " times!");
        System.out.println("Here's your list of guesses "+ allGuessesList.toString());
    }

    private int GetRandomNumber() {
        return (int) (Math.random() * (upperLimit - lowerLimit)) + lowerLimit;
    }

    private void resetGame(int lowerLimit, int upperLimit) {
        userWon = false;
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        this.randomNumber = GetRandomNumber();
        allGuessesList.clear();
    }

}
