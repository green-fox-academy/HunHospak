package com.timbuchalka;
import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user

        System.out.println("Hello, what is your name?");
        String s = input.nextLine();
    }
}