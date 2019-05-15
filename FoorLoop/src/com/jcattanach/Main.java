package com.jcattanach;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

    }

    public static double calculateInterest(double amount, double interetRate){
        return amount * (interetRate / 100);
    }
}
