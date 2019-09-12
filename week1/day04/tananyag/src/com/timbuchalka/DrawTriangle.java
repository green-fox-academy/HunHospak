package com.timbuchalka;

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

        Scanner input = new Scanner(System.in);
        int szam = input.nextInt();
        for (int i = 0; i < szam+1 ; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
