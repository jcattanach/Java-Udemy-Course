package com.jackcattanach;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){


        int kiloBytesRemaining = kiloBytes % 1024;

        int megaBytes = (kiloBytes - kiloBytesRemaining) / 1024;

        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println( kiloBytes +  " KB = " +
                    megaBytes + " MB and " +
                    kiloBytesRemaining + " KB");
        }

    }
}
