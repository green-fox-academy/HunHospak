public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        StringBuilder s = new StringBuilder(todoText);
        s.insert(0, "My todo:\n");
        s.append(" - Download games \n - Diablo");
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention
        System.out.println(s);


        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //  - Diablo

        //System.out.println(todoText);
    }
}