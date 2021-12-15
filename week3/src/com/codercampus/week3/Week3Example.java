package com.codercampus.week3;

import java.util.Scanner;

public class Week3Example {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Type a number between 50 and 300");
        String number = userInput.next();

        String savedNumber = getNumber(number);
        System.out.println("The number you typed in was: " + savedNumber);
        userInput.close();
    }

    private static String getNumber(String number) {
        int n = Integer.parseInt(number);

        if (n < 50 || n > 300) {
            return null;

        } else {

            return number;

        }

    }

}