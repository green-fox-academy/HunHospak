package com.timbuchalka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String message= "This is tutorial number three.";
        System.out.println(message);

        Scanner input = new Scanner(System.in);
        System.out.println("Please input your favourite number: ");
        int favouriteNum = input.nextInt();

        System.out.println("Your favourite number is: " + favouriteNum);;


    }
}
