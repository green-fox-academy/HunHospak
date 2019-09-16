public class Unique {
    public static String myArray (int [] input) {
        boolean igaze = true;
        String output = "";
        for (int i = 0; i < input.length ; i++) {
            igaze = true;

            for (int j = i-1; j >= 0; j--) {
                if (input[i]==input[j]) {
                    igaze = false;
                }

            }
            if (igaze == true) {
                output+=" " + input[i];
            }

        }
    return output;
    }

    public static void main(String[] args) {

        System.out.println(myArray(new int[] {2,2,3,4,2,2,4,11}));
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        //System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
    }
}