package com.javapoc.advanced.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAndLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        // [0][1][2][3][4]
        LinkedList<Integer> list = new LinkedList<Integer>();
        //[0]->[1]->[2]->[3]->[4]....

        values.add(20);
        values.add(60);
        values.add(200);

        System.out.println(values.get(2));

        for (int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i));
        }
        values.remove(0);

        for (Integer myVal : values) {
            System.out.println(myVal);
        }
    }
}
