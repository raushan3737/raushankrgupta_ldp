package com.javapoc.advanced.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetPlayground {
    public static void main(String[] args) {
        // Creating an empty HashSet
        HashSet<String> stringSet = new HashSet<String>();
        // Adding elements into HashSet using add() method
        stringSet.add("India");
        stringSet.add("Australia");

        // Removing items from HashSet using remove() method
        stringSet.remove("Australia");
        System.out.println("List after removing Australia:" + stringSet);

        // Iterating over hashSet items
        Iterator<String> iterator = stringSet.iterator();
        // Holds true till there is single element remaining
        while (iterator.hasNext())

            // Iterating over elements  using next() method
            System.out.println(iterator.next());
    }

}


