package com.jcattanach;

public class Main {

    public static void main(String[] args) {
        GearBox mcLaren = new GearBox(6);
        GearBox.Gear first = mcLaren.new Gear(1,12.4);

        //GearBox.Gear second = new GearBox.Gear(2, 15.8);  This does not work
        //GearBox.Gear third = new mcLaren.Gear(3, 17.8); This also doesnt work, have to use the mclaren.new syntax


        System.out.println(first.driveSpeed(1000));



    }
}
