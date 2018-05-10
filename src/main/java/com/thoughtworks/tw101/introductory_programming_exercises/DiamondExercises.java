package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****

    private static void drawAnIsoscelesTriangle(int n) {
        int lineCount = n;
        int starCount = 1;
        int spaceCount = n - 1;

        for(int i = 0; i < lineCount; i++) {
            printSpaces(spaceCount);
            printStars(starCount);
            starCount += 2;
            spaceCount -= 1;
            System.out.println();
        }
    }

    private static void printSpaces(int numberOfSpaces) {
        for(int i = 0; i < numberOfSpaces; i++) {
            System.out.print(" ");
        }
    }

    private static void printStars(int numberOfStars) {
        for(int i = 0; i < numberOfStars; i++) {
            System.out.print("*");
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *

    /*
    DUPLICATE CODE (DISPENSABLE) AND LONG METHODS (BLOATER)
    ALL SHAPES DRAW AN ISOSCELES TRIANGLE AND REUSE THIS CODE.
    WHY NOT CALL THIS METHOD INSIDE THEM?
 */
    private static void drawADiamond(int n) {
        drawAnIsoscelesTriangle(n);
        drawBottomHalfOfDiamond(n);
    }

    private static void drawBottomHalfOfDiamond(int n) {
        int lineCount = n - 1;
        int starCount = n*2 - 3;
        int spaceCount = 1;

        for(; n > 0; n--) {
            printSpaces(spaceCount);
            printStars(starCount);
            starCount -= 2;
            spaceCount += 1;
            System.out.println();
        }
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        int lineCount = n;
        int starCount = 1;
        int spaceCount = n - 1;

        //top part
        for(int i = 0; i < lineCount - 1; i++) {
            printSpaces(spaceCount);
            printStars(starCount);
            starCount += 2;
            spaceCount -= 1;
            System.out.println();
        }

        System.out.println("Felix");

        //bottom part
        drawBottomHalfOfDiamond(n);
    }
}
