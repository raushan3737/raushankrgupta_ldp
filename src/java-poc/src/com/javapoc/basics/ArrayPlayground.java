/*
All arrays are dynamically allocated.
The size of an basics.array must be specified by int or short value and not long.
This storage of arrays helps us randomly access the elements of an basics.array
 */

package com.javapoc.basics;


public class ArrayPlayground {
    private String id ;
    public  ArrayPlayground(String id){
        this.id = id;
    }

    public static void main(String[] args) {
        System.out.println("<== Array in Java ==> ");
        // Reference type , default variable for integer is 0
        // Creation of basics.array
        int[] numbers = new int[5]; // allocating memory to basics.array
//        int[] numbers = {1,2,3,4,5} ;
        System.out.println("Address of basics.array numbers: " +numbers);
        // Initialising the value by basics.array index.
        numbers[0] = 0 ;
        numbers[1] = 1;
        // Updating the value at the specified index
        numbers[0] = 100 ;

        int firstElement = numbers[0] ;
        int lastElement = numbers[numbers.length-1] ;
        System.out.println("The first & last element of the basics.array is: " +  firstElement + " " + lastElement);

        // Iterating over the all elements of the basics.array
        System.out.println("Printing all element by for loop: ");
        for(int index= 0; index < numbers.length ; index++){
            System.out.println(numbers[index]);
        }
        System.out.println("Printing all element by for each loop: ");
        for(int number : numbers){
            System.out.println(number) ;
        }

        // Creating basics.array of object of class ArrayPlayground
        ArrayPlayground[] arrayPlayground  =  new ArrayPlayground[2];
        arrayPlayground[0] = new ArrayPlayground("0");
        arrayPlayground[1] = new ArrayPlayground("1");
        for (ArrayPlayground playground : arrayPlayground) {
            System.out.println(playground.id);
        }



    }
}