package com.thoughtworks.tw101.exercises.exercise8;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//Identify two dispensables, two bloaters, and one OO abuser.

public class GuessingGame {
    boolean userWon = false;
    int lowerLimit, upperLimit, userGuess, randomNumber;
    ArrayList<Integer> allGuessesList;

    public GuessingGame() {
        allGuessesList = new ArrayList<>();
    }


        /*  LONG METHOD (BLOATER)
        A method contains too many lines of code.
        Generally, any method longer than ten lines should make you start asking questions.
         */
    public void play(int lowerLimit, int upperLimit) {
        resetGame(lowerLimit, upperLimit);

        System.out.println("Let's play a game (Jigsaw voice)");
        System.out.println("Guess a random number between "+lowerLimit+" and "+upperLimit+" \n");

        mainGameLoop();

        System.out.println("You guessed "+allGuessesList.size()+ " times!");
        System.out.println("Here's your list of guesses "+ allGuessesList.toString());
    }

    private void mainGameLoop() throws NumberFormatException  {
        Scanner reader = new Scanner(System.in);

        try {
            while (!userWon) {
                System.out.println("Please enter your guess:");
                userGuess = reader.nextInt();

                checkUserGuess(userGuess);
                allGuessesList.add(userGuess);
            }
        } catch (NumberFormatException e) {
            System.out.print("Guesses can only be numbers ! (Jigsaw voice)\n");
        } catch (InputMismatchException e) {
            System.out.print("Guesses can only be numbers ! (Jigsaw voice\n");
        }

        reader.close();
    }

    private void checkUserGuess(int userGuess) {
        if(userGuess == randomNumber) {
            userWon = true;
            System.out.println("You guessed correct!\n");
        } else if (userGuess > randomNumber) {
            System.out.println("TOO HIGH!, try again!\n");
        } else {
            System.out.println("TOO LOW!, try again!\n");
        }
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
