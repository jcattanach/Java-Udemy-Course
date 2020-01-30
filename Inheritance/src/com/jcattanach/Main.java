package com.jcattanach;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("Animal", 1,1,5,5);

        Dog dog = new Dog("yorkie", 8,2,2,4,1,20, "smooth");
        dog.eat();
    }
}
