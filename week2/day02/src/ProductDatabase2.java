import java.util.HashMap;

public class ProductDatabase2 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Eggs",200);
        map.put("Milk",200);
        map.put("Fish",400);
        map.put("Apples",150);
        map.put("Bread",50);
        map.put("Chicken",550);

        for (String key: map.keySet()) {
            if (201>map.get(key)) System.out.println(key);

        }
        for (String key: map.keySet()) {
            if (150<map.get(key)) System.out.println(key + " " + map.get(key));
        }
    }
}
