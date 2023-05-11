package com.javapoc.advanced.collections;

import java.util.*;

class SortStringLength implements Comparator<String> {

    @Override
    public int compare(String string1, String string2) {
        int strLength1 = string1.length();
        int strLength2 = string2.length();

        if (strLength1 > strLength2) {
            return 1;
        } else if (strLength1 < strLength2) {
            return -1;
        }
        return 0;
    }
}

class SortInAlpabeticalOrder implements Comparator<String> {

    @Override
    public int compare(String string1, String string2) {
        return string1.compareTo(string2);
    }
}

class SortInReverseAlpabeticalOrder implements Comparator<String> {

    @Override
    public int compare(String string1, String string2) {
        return string2.compareTo(string1);
    }
}

public class SortingList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<String>();
        colors.add("green");
        colors.add("purple");
        colors.add("grey");
        colors.add("black");
        colors.add("white");
        colors.add("red");

//        Collections.sort(colors, new SortStringLength());
//        Collections.sort(colors, new SortInAlpabeticalOrder());
        Collections.sort(colors, new SortInReverseAlpabeticalOrder());
        for (String color : colors) {
            System.out.println(color);
        }

        List<Integer> values = new ArrayList<Integer>();
        values.add(59);
        values.add(2);
        values.add(5);
        values.add(4);
        values.add(21);
        Collections.sort(values, new Comparator<Integer>() {
            @Override
            public int compare(Integer val1, Integer val2) {
                return val2.compareTo(val1);
            }
        });

        for (Integer val : values) {
            System.out.println(val);
        }
    }
}
