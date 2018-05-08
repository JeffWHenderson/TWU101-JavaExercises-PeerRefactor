package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        //print all numbers from 1 to 100
        printAllOddNumbers(100);
    }

    private static void printAllOddNumbers(int limit) {
        for(int i = 1; i < limit + 1; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
