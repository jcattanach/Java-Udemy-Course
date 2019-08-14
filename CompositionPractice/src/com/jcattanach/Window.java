package com.jcattanach;

public class Window {

    private Dimensions dimensions;
    private int numberOfPanes;

    public Window(Dimensions dimensions, int numberOfPanes) {
        this.dimensions = dimensions;
        this.numberOfPanes = numberOfPanes;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getNumberOfPanes() {
        return numberOfPanes;
    }

    public void cleanWindows(){
        System.out.println("Your windows are now clean.");
    }
}
