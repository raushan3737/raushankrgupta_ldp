package com.javapoc.advanced.collections;

import java.util.HashMap;
import java.util.Map;

public class HashmapPlayground {
    public static <Set> void main(String[] args) {
        // Creation of HashMap which will store Key as String & value as Integer
        // Syntax:
        //  HashMap<key,value> = new HashMap<>();
        HashMap<String, Integer> map = new HashMap<>();
        // Inserting the pair if the key is exist then value will be updated else new pair is inserted.
        map.put("India", 141);
        map.put("China", 150);
        map.put("USA", 90);
        System.out.println("Printing the map: " + map);

        // Search
        // ContainsKey: returns boolean
//        if (map.containsKey("China")) {
//            System.out.println("Key is the present in the map");
//            int value = map.get("USA"); // If key is exist then return the value else return null
//            System.out.println("China: " + value);
//        } else {
//            System.out.println("Key is not present in the map");
//        }

        // Iterating over Hashmap
        // entrySet() will make a set for all key-value pair present in the map
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

//        // Making set of key using keySet()
//        Set<String> keys = map.keySet();
//
//        for (String key : keys) {
//            System.out.println(key + " " + map.get(key));
//        }

        // Removing the element
        System.out.println("Status before removing: " + map);
        map.remove("USA");
        System.out.println("Status before removing: " + map);

        // Clear the map
//        map.clear(); map.isEmpty();  map.size(); map.values(); replace(K key, V value); replace(K key, V oldValue, V newValue);

    }
}
