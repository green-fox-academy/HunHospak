package com.timbuchalka;
import java.util.Scanner;

public class MileToKm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me how many miles it is:");
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        int s = input.nextInt();
        float b = s * 1.609f;
        System.out.println("It is: " + b + "km long");


    }
}