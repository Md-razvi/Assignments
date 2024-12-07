package Day16;

import java.util.HashMap;

public class HashList_02 {
    public static void main(String args[]) {
        HashMap<String, String> Games = new HashMap<>();

        // 1) Put function - Adding elements to the HashMap
        Games.put("Game1", "Spider Man: Web Of Shadows");
        Games.put("Game2", "Batman: Arkham Knight");
        Games.put("Game3", "Batman: Arkham City");
        Games.put("Game4", "Spider Man: Shattered Dimensions");
        Games.put("Game5", "Dishonored");
        Games.put("Game6", "Dishonored 2");
        Games.put("Game7", "God Of War 1");
        Games.put("Game8", "God Of War 2");
        Games.put("Game9", "God Of War 3");
        Games.put("Game10", "God Of War: Ragnarok");
        System.out.println("Initial HashMap: " + Games);
        // 2) Get function - Retrieve value using a key
        System.out.println("Value for Game3: " + Games.get("Game3"));
        // 3) Check if a key exists
        System.out.println("Does key 'Game5' exist? " + Games.containsKey("Game5"));
        // 4) Check if a value exists
        System.out.println("Does value 'Dishonored 2' exist? " + Games.containsValue("Dishonored 2"));
        // 5) Remove an entry
        Games.remove("Game10");
        System.out.println("After removing Game10: " + Games);

        // 6) Iterate through the HashMap
        System.out.println("Iterating over the HashMap:");
        for (String key : Games.keySet()) {
            System.out.println("Key: " + key + ", Value: " + Games.get(key));
        }

        // 7) Replace a value
        Games.replace("Game2", "Batman: Arkham Asylum");
        System.out.println("After replacing value of Game2: " + Games);

        // 8) Size of the HashMap
        System.out.println("Size of HashMap: " + Games.size());

        // 9) Clear all entries
        Games.clear();
        System.out.println("HashMap after clearing: " + Games);

        // 10) Check if HashMap is empty
        System.out.println("Is the HashMap empty? " + Games.isEmpty());
    }
}
