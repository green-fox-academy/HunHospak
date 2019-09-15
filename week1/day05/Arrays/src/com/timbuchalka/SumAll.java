package com.timbuchalka;

public class SumAll {
    public static void main(String[] args) {
        // - Create an array variable named `ai`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Print the sum of the elements in `ai`

        int [] ai= {3,4,5,6,7};
        int b=0;
        int sum=0;
        for (int i = 0; i <ai.length ; i++) {
            b=ai[i];
            sum=sum+b;



        }
        System.out.println("the sum of all elements of ai is: " + sum);
    }
}
