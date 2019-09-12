package com.timbuchalka;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8

        Scanner input = new Scanner(System.in);
        int computer = 22;
        boolean isNumber = true;
        while (isNumber==true) {
            int number = input.nextInt();
                if (number > computer) {
                    System.out.println("Your number is too high!");
                } else if (number < computer ) {
                    System.out.println("Your number is too low!");
                } else {
                    System.out.println("You got it!");
                    isNumber=false;
                }
        }

    }
}
