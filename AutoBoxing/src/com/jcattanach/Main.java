package com.jcattanach;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Integer myIntValue = 56; // Same as Integer.valueOf(56);
        int myInt = myIntValue; //  myInt.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0 ; dbl+=0.5) {
            myDoubleValues.add(dbl);
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i);
            System.out.println(i + " ---> " + value);
        }

    }
}
