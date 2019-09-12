package com.timbuchalka;
import java.util.Scanner;

public class DrawDiagonalTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i = 0; i < number ; i++) {
            System.out.print("% ");
        }
        System.out.println();

        for (int i = number-2; i > 0 ; i--) {
            System.out.print("%");
            for (int j = i; j < number; j++) {
                System.out.print(" ");
            }

            System.out.print("%");

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("%");
        }
        for (int i = 0; i < number ; i++) {
            System.out.print("% ");
        }
    }
}
