package com.jcattanach;

public class Main {

    public static void main(String[] args) {

        //Without Encapsulation
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//
//        player.loseHealth(damage);
//        System.out.println("Remaining Health =  " + player.healthRemaining());
//
//        damage = 11;
//
//        player.loseHealth(damage);
//        System.out.println("Remaining Health =  " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "sword");


        System.out.println("Initial health is "+player.getHealth());

    }

}
