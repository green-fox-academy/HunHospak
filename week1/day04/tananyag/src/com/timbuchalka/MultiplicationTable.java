package com.timbuchalka;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a program that asks for a number and prints the multiplication table with that number
        //
        // Example:
        // The number 15 should print:
        //
        // 1 * 15 = 15
        // 2 * 15 = 30
        // 3 * 15 = 45
        // 4 * 15 = 60
        Scanner input = new Scanner(System.in);
        int szam = input.nextInt();
        for (int i = 1; i <11 ; i++) {
            System.out.println(i + " * " + szam + " = " + szam*i);

        }

    }
}
