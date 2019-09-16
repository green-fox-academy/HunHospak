import java.lang.reflect.Array;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and an array of integers as a parameter
        //  Returns the indices of the integers in the array of which the first number is a part of
        //  Or returns an empty array if the number is not part of any of the integers in the array

        //  Example:
        //System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        //System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'

        int [] myArray = subArr(1,new int[] {2,2,3,2,62});
        for (int i = 0; i <myArray.length ; i++) {
            System.out.println(myArray[i]);
        }



    }
    public static int [] subArr (int input, int [] arr) {
        int [] sum = new int [arr.length];
        for (int i=0; i<arr.length; i++) {
            if (input==arr[i]) {
                sum[i] = i;
            }
        }
        return sum;
    }


}