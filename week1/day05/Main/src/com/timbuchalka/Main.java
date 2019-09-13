import java.util.Arrays;
package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        String[] stringArray = {"adam", "kiss" , "programming"};
        int[] numberArray= new int[10];

        for (int i = 0; i < stringArray.length; i++) {
            numberArray[i]=i;

        }

        int k = 1;
        while (k <= 41) {
            System.out.print('-');
            k++;
        }
        System.out.println();
        for (int j=0; j<numberArray.length;j++) {
            System.out.print("| " + j + " ");
        }
        System.out.println();

        String [][] multiArray = new String [10][10];


    }
}
