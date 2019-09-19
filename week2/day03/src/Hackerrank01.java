import java.util.Scanner;

    public class Hackerrank01 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            for(int i=1; scan.hasNext() ; System.out.println(i++ +" "+scan.nextLine()));
        }

    /*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String szoveg = "";
        int sum=0;
        boolean igen = false;

       *//*while (!szoveg.endsWith("end-of-file")) {
            szoveg = input.nextLine();
            sum++;
            System.out.print(sum + " " +szoveg);
        }*//*
        for (int i = 1; igen==false; i++) {
            szoveg=input.nextLine();
            if (szoveg.endsWith("end-of-file.")) {
                System.out.print(i + " " +szoveg);
                igen=true;
            } else {
                System.out.println(i + " " +szoveg);
            }

        }
    }*/

}