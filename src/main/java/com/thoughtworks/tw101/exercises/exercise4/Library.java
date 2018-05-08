package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {
        int totalNumberOfBooks = books.length;

        for(int i = 0; i < totalNumberOfBooks; i++) {
            String currentBookTitle = books[i];

            if(currentBookTitle.contains(partialBookTitle)) {
                System.out.println(currentBookTitle);
            }
        }
        System.out.println();
    }
}
