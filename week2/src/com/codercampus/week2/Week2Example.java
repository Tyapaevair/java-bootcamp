package com.codercampus.week2;

import java.util.Scanner;

public class Week2Example {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Type a number between 50 and 300");

        String input = userInput.nextLine();
        int number = Integer.parseInt(input);
        if (number < 50 || number > 300){
            System.out.println("No!");
        }else{
            System.out.println("Yes!");
        }

    }
}
