

import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("USA", 100);
        map.put("UAE", 150);
        map.put("Russia", 200);
        map.put("India", 10000);
        map.put("Pak", 10);

        // System.out.println("Old One : ");
        // System.out.println(map);

        // // map.putIfAbsent("USA", 120);
        // map.put("USA", 120);

        // System.out.println("New One: ");
        // System.out.println(map);

        // map.put("russia", 25);        
        // System.out.println(map);

        // System.out.println(map.get("india"));   // null

        // System.out.println(map.getOrDefault("Zimbawe", 500));

        // System.out.println( map.containsKey("Zimbawe") );

        // System.out.println( map.containsValue(10000) );

        // System.out.println(map.remove("Pak"));
        // System.out.println(map);
    }
}
