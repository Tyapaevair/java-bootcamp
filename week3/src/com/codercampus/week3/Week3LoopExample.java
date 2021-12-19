package com.codercampus.week3;

import java.util.Scanner;

public class Week3LoopExample {
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
            while (n < 50 || n > 300) {
                System.out.println("Oops, that number wasn't between 50 and 300, try again: ");
                Scanner userInput = new Scanner(System.in);
                number  = userInput.next();
                n = Integer.parseInt(number);

                }

            return number;


        } else {

            return number;

        }
    }
}

