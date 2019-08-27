package com.jcattanach;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Enter count: ");
	    int count = scanner.nextInt();
	    scanner.nextLine();

	    int[] returnedArray = readIntegers(count);

        System.out.println("Minimum is " + findMin(returnedArray));


    }

    private static int[] readIntegers(int count){

        int[] array = new int[count];

        for(int i = 0;i < array.length; i++){
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array){
         int min = Integer.MAX_VALUE;

         for(int i = 0; i < array.length; i++){
             int value = array[i];
             if(value < min){
                 min = value;
             }
         }
         return min;
    }

//    private static int findMin(int[] array){
//        //int min = Integer.MAX_VALUE;
//
//        int sortedArray[] = Arrays.copyOf(array, array.length);
//
//        boolean flag = true;
//        int temp;
//
//        while(flag){
//            flag = false;
//            for(int i = 0;i < sortedArray.length - 1; i++){
//                if(sortedArray[i] < sortedArray[i + 1]){
//                    temp = sortedArray[i];
//                    sortedArray[i] = sortedArray[i + 1];
//                    sortedArray[i + 1] = temp;
//                    flag = true;
//                }
//            }
//        }
//
//
//        return sortedArray[sortedArray.length - 1];
//    }
}
