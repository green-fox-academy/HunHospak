package com.timbuchalka;

public class ReverseList {
    public static void main(String[] args) {
        // - Create an array variable named `aj`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `aj`
        // - Print the elements of the reversed `aj`

        int [] aj = {3,4,5,6,7};
        for (int i = aj.length-1; i >= 0 ; i--) {
            System.out.println(aj[i]);

        }
    }
}
