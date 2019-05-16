package com.jcattanach;

public class Main {

    public static void main(String[] args) {
//	// write your code here
//        int count = 6;
//
////        while(true){
////            if(count == 6){
////                break;
////            }
////            System.out.println(count);
////            count++;
////        }
//
//        do {
//            System.out.println("Count is " + count);
//            count++;
//
//            if (count >100){
//                break;
//            }
//        } while (count != 6);

        isEvenNumber(25);
    }

    public static void isEvenNumber(int num){
        if(num % 2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}

