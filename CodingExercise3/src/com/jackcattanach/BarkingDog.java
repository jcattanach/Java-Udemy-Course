package com.jackcattanach;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int timeOfDay){

        if(timeOfDay < 0 || timeOfDay > 23){
            return false;
        }

        if( timeOfDay >= 8 && timeOfDay <= 22) {
            return false;
        } else {
            return barking;
        }
    }
}