package com.timbuchalka;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Given an integer, n , print its first 10 multiples. Each multiple N*i (1<i<10)
        //(where ) should be printed on a new line in the form: N x i = result.

        int n = input.nextInt();

        for (int i=1;i<11;i++) {
            int b = n*i;
            System.out.println(n + " x " + i + " = " + b);
        }




    }
}
