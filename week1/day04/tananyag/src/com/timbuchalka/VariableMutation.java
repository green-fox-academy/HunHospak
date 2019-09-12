package com.timbuchalka;

public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a +=10;

        System.out.println(a);

        int b = 100;
        b -=7;

        System.out.println(b);

        int c = 44;
        c *= 2;

        System.out.println(c);

        int d = 125;
        d /=5d;

        System.out.println(d);

        int e = 8;
        Math.pow(8,2);

        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        System.out.println((boolean)(f1>f2));

        int g1 = 350;
        int g2 = 200;
        System.out.println((boolean)(g2>g1));
        // tell if the double of g2 is bigger than g1 (print as a boolean)

        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        System.out.println(h%11==0);

        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        if (Math.pow(i2,2)<i1 && i1<Math.pow(i2,3));

        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)

    }
}
