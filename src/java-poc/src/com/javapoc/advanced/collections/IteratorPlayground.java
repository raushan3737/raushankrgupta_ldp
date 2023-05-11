package com.javapoc.advanced.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPlayground {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);

        // Creation of iterator for number arraylist (i.e collection)

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if (i < 10) {
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}


/*
Java Iterator: An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
It is called an "iterator" because "iterating" is the technical term for looping.

Present in java.util package.
Getting an Iterator
The iterator() method can be used to get an Iterator for any collection.

Looping Through a Collection
To loop through a collection, use the hasNext() and next() methods of the Iterator.

Note: Note: Trying to remove items using a for loop or a for-each loop would not work correctly
 because the collection is changing size at the same time that the code is trying to loop.

 */

