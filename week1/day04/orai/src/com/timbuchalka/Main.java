package com.timbuchalka;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Given an integer, n , print its first 10 multiples. Each multiple N*i (1<i<10)
        //(where ) should be printed on a new line in the form: N x i = result.

        /*int n = input.nextInt();

        for (int i=1;i<11;i++) {
            int b = n*i;
            System.out.println(n + " x " + i + " = " + b);
        }*/

        // next exercise: given a, b, n, q
        // q - number of queries ai, bi, ni
        /*int q = input.nextInt();
        for (int s = 0; s<q; s++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            double szamom;
            double vegleges = 0;

            for (int i = 0; i < n; i++) {
                szamom = vegleges + (Math.pow(2, i) * b);
                vegleges = szamom;
                System.out.print((int) (vegleges) + a + " ");
            }
            System.out.println();*/

        int t=input.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=input.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127) {
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (x>=-32768 &&  x<=32767) {
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (x>=-Math.pow(2,31) &&  x<=Math.pow(2,31)-1) {
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (x>=-Math.pow(2,63) &&  x<=Math.pow(2,63)-1) {
                    System.out.println("* long");
                }

            }
            catch(Exception e)
            {
                System.out.println(input.next()+" can't be fitted anywhere.");
            }

        }




    }















}
