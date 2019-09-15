package com.timbuchalka;

public class Swap {
    public static void main(String[] args) {
        // - Create an array variable named `abc`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `abc`
        String [] abc = {"first","second", "third"};
        String plusz = abc[0];
        abc [0] = abc[2];
        abc [2] = plusz;
        for (int i = 0; i < abc.length; i++) {
            System.out.println(abc[i]);

        }
    }
}
