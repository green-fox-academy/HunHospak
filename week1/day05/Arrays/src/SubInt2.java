public class SubInt2 {
    //  Example:
    //System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
    //  should print: `[0, 1, 4]`
    //System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
    //  should print: '[]'

    public static void main(String[] args) {
        System.out.println(subInt(1, new int[] {1,2,3,51,65}));

    }

    public static String subInt (int input, int [] myArray) {
        //String elso = Integer.toString(input);
        String [] masodik = new String [myArray.length];
        String output = "";
        for (int i = 0; i < masodik.length ; i++) {
            masodik [i] = Integer.toString(myArray[i]);
            if (masodik [i].contains(Integer.toString(input))) {
                output += " " + i + " ";
            }


        } return output;
    }
}
