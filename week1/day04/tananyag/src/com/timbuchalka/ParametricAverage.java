package com.timbuchalka;

import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number=input.nextDouble();
        double sum = 0d;
        double average = 0d;
        for (double i = 0d; i < number ; i++) {
            double yours = input.nextDouble();
            sum=sum+yours;
        }
        average = sum/number;
        System.out.println("Your sum is: " + (int) (sum));
        System.out.println("Your average is: " + (int) (average));

    }
}
