package com.codercampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {

        Random theRandomNumber = new Random();
        int r = theRandomNumber.nextInt(100);

        Scanner userInput = new Scanner(System.in);
        System.out.println("Pick a number between 1 and 100");
        String number = userInput.next();
        int n = Integer.parseInt(number);

        int i = 1;

        while (i < 5 && r != n){


                if (n < r && n >= 0 && n <= 100) {
                    System.out.println("Please pick a higher number");
                    String newNumber = userInput.next();
                    n = Integer.parseInt(newNumber);
                i = i + 1;

                } else if (n > r && n >= 0 && n <= 100) {
                    System.out.println("Please pick a lower number");
                    String newNumber = userInput.next();
                    n = Integer.parseInt(newNumber);
                i = i + 1;

                } else if (n < 0 || n > 100){
                    System.out.println("Your guess is not between 1 and 100, please try again");
                    String newNumber = userInput.next();
                    n = Integer.parseInt(newNumber);
                i = i + 0;
                }



            }
        if (r != n){
            System.out.println("You lose, the number to guess was " + r);
        }
        else {
            System.out.println("You win!");
        }
        }

    }




