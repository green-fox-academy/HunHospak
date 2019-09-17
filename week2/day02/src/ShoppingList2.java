import java.util.HashMap;

public class ShoppingList2 {
    public static void main(String[] args) {
        HashMap <String, Double> map = new HashMap<>();
        map.put("Milk",1.07);
        map.put("Rice",1.59);
        map.put("Eggs", 3.14);
        map.put("Cheese",12.60);
        map.put("Chicken Breasts",9.40);
        map.put("Apples",2.31);
        map.put("Tomato",2.58);
        map.put("Potato",1.75);
        map.put("Onion",1.10);

        HashMap <String,Integer> map2 = new HashMap<>();
        map2.put("Milk",3);
        map2.put("Rice",2);
        map2.put("Eggs", 2);
        map2.put("Cheese",1);
        map2.put("Chicken Breasts",4);
        map2.put("Apples",1);
        map2.put("Tomato",2);
        map2.put("Potato",1);

        HashMap <String,Integer> map3 = new HashMap<>();
        map3.put("Rice",1);
        map3.put("Eggs", 5);
        map3.put("Chicken Breasts",2);
        map3.put("Apples",1);
        map3.put("Tomato",10);


        double bob = 0;
        double alice =0;
        for (String key: map2.keySet()) {
            bob += map2.get(key) * map.get(key);
             }
        System.out.println(bob);
        for (String key: map3.keySet()) {
            alice += map3.get(key) * map.get(key);
        }
        System.out.println(alice);

        if (map2.get("Rice")>map3.get("Rice")) {
            System.out.println("Bob buys more rice.");
        } else {
            System.out.println("Alice buys more rice.");
        }
        int lBob =0;
        int lAlice=0;

        for (String key:map2.keySet()) {
            lBob++;
        }
        for (String key : map3.keySet()) {
            lAlice++;
        }
        if (lBob>lAlice) {
            System.out.println("BOB!");
        } else {
            System.out.println("ALICE!");
        }
    }
}
