package com.jcattanach;

public class Furniture {
    private String name;
    private String material;

    public Furniture(String name, String material) {
        this.name = name;
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public void moveFurniture(){
        System.out.println("Moving furniture ");
    }

}
