package com.timbuchalka;

import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();

        for (int i = 0; i < first; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < first-2 ; i++) {
            System.out.println("*");
            for (int j = 0; j < first-2 ; j++) {
                System.out.print(" ");

            }
        }



        for (int i = 0; i < first; i++) {
            System.out.print("*");
        }

    }
}
