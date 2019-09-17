import java.util.HashMap;

public class ProductDatabase {
    public static void main(String[] args) {
        HashMap <String,Integer> map = new HashMap<>();
        map.put("Eggs",200);
        map.put("Milk",200);
        map.put("Fish",400);
        map.put("Apples",150);
        map.put("Bread",50);
        map.put("Chicken",550);
        int nagy = 0;
        int i=0;
        int ossz=0;
        int k=0;
        boolean equal = false;
        System.out.println(map.get("Fish"));
        for (String key: map.keySet()) {
            if (nagy<map.get(key)) {
                nagy=map.get(key);
            }
            i ++;
            ossz+=map.get(key);
            if (300>map.get(key)) {
                k++;
            }
            if (map.get(key)==125) equal=true;
        }
        System.out.println(nagy);
        System.out.println(ossz/i);
        System.out.println(k + " products are below 300.");
        System.out.println(equal);
        int kulcs = nagy;
        for (String key: map.keySet()) {
            if (map.get(key)<kulcs) {
                kulcs=map.get(key);
            }
        }
        System.out.println(kulcs);
    }
}
