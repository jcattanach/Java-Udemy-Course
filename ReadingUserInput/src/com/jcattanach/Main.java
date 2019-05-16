package com.jcattanach;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth year: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handle enter key

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        int age = 2019 - yearOfBirth;


        System.out.println("your name is " +  name + ", and you are " + age + " years old.");


        scanner.close();


    }
}
