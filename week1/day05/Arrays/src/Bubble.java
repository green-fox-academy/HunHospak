public class Bubble {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `true` sort that list descending

        //  Example:
        //System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
        //  should print [5, 9, 12, 24, 34]
        //System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
        //  should print [34, 24, 12, 9, 5]
        int [] tomb = {5, 11, 4, 25, 8};
        for (int i = 0; i <Ascending(tomb).length ; i++) {
            System.out.println(Ascending(tomb)[i]);

        }

    }
    
    public static int [] Ascending (int [] input) {
        int temp = 0;
        for (int i = 0; i < input.length-1 ; i++) {
            if (input[i]>input[i+1]) {
                temp = input[i];
                input [i] = input [i+1];
                input [i+1] = temp;

                //Swap(input[i],input[i+1]);
                // input [i] = Swap(input[i],input[j] [0])
                // input [j] = Swap(input[i],input[j] [1]) kb
            }
            
        }
        return input;
    }

    // I will not do descending

    public static int [] Swap (int a, int b) {
        int c = a;
        a=b;
        b=c;
        return new int[] {a,b};
    }
}
