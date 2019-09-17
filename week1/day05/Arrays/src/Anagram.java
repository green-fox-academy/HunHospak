public class Anagram {
    public static void main(String[] args) {
        System.out.println(arrayAnagram("god", "god"));

    }

    public static boolean arrayAnagram (String input, String input2) {
        boolean igaze = false;
        int sum=0;
        for (int i = 0; i < input.length() ; i++) {
            for (int j = 0; j <= i ; j++) {
                if (input.charAt(i)==input2.charAt(j)) {
                    sum +=1;
                }

            }
        }
        if (sum==input.length()){
            return true;
        } else {
            return false;
        }
    }
}
