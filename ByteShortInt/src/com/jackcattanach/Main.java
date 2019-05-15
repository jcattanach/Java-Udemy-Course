package com.jackcattanach;

public class Main {

    public static void main(String[] args) {

        int myInt = 50;
        byte myByte = 10;
        short myShort = 20;

        long myLong = 50000L + 10 * (myByte + myInt + myShort);
        System.out.println("myLong = " + myLong);
    }
}
