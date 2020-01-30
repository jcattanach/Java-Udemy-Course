package com.jcattanach;

public class Room {

    private Window window;
    private Furniture furniture;

    public Room(Window window, Furniture furniture) {
        this.window = window;
        this.furniture = furniture;
    }

//    public Window getWindow() {
//        return window;
//    }
//
//    public Furniture getFurniture() {
//        return furniture;
//    }

    public void cleanRoom(){
        window.cleanWindows();
    }
}
