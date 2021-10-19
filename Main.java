package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int [] myIntegers = getIntegers(5);
        int []sorted = sortIntegers(myIntegers);
        printArray(sorted);

    }
    public static int[] getIntegers(int capacity){
        int [] array = new int[capacity];
        System.out.println("Enter "+capacity + " integer values: \r");
        for (int i = 0;i<array.length;i++){
            array[i] = scanner.nextInt();

        }
        return array;
    }

    public static void printArray(int[]array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);

        }
    }

        public static int[] sortIntegers(int [] array){
//            int[] sortedArray = new int[array.length];
//
//            for(int i = 0;i< array.length; i++){
//                sortedArray[i] = array[i];
//            }
            int[] sortedArray = Arrays.copyOf(array, array.length); // creates a copy of an array into another array, in this case the array being passed

            boolean flag = true;
            int temp;
            while (flag){ // while flag is true
                flag = false;
                // element 0 = 160
                // element 1 = 50
                // element 2 = 40
                for(int i = 0; i<sortedArray.length-1; i++){ // will continue to check the length of the array until it is finished
                    if(sortedArray[i] < sortedArray[i+1]){ // if the value in sortedArray[i] is less than the the following value in the array, then:
                        temp = sortedArray[i]; // the value of temp gets replaced with the value of [i] in sortedArray
                        sortedArray[i] = sortedArray[i+1]; // the value of sortedArray[i] gets replaced with the following value in the array
                        sortedArray[i+1] = temp; // the following value in sortedArray gets replaced with temp
                        flag = true;

                    }


                }
            }
            return sortedArray;


        }





    }


