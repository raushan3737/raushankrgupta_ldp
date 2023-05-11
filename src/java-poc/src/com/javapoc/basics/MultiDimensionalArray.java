/*
  First bracket will take how many basics.array you want to store & 2nd bracket asked for no of elements in the each basics.array
  Syntax:  DataType nameofArray = new DataType[x][y]; x is the no of basics.array , y is the no of elements in each basics.array.
          x is compulsory , y is optional
 */

package com.javapoc.basics;


public class MultiDimensionalArray {

    public static void main(String[] args) {

        int[] oneDimensionalArray = {12, 22, 32};

        // Creation of multi dimensional basics.array
        int[][] multiDimensionalArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // First square bracket gives us basics.array at that index
//        System.out.println(multiDimensionalArray[1][2] + " " + multiDimensionalArray[2][2]);

        double[][] multiDimensionalContainer = new double[4][2];
        System.out.println(multiDimensionalContainer[2][1]);

        //Iterating over multi dimensional basics.array
        for (int rowIndex = 0; rowIndex < multiDimensionalArray.length; rowIndex++) {
            for (int elements = 0; elements < multiDimensionalArray[rowIndex].length; elements++) {
                System.out.print(multiDimensionalArray[rowIndex][elements] + "\t");
            }
            System.out.println();
        }

        for (int[] arr : multiDimensionalArray) {
            for (int ele : arr) {
                System.out.println(ele + "\t");
            }
            System.out.println();
        }
    }

}
