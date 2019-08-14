package com.jcattanach;

public class Main {

    public static void main(String[] args) {

        Room room = new Room(new Window(new Dimensions(50, 50), 2), new Furniture("couch", "leather"));

        room.cleanRoom();
    }
}
