package com.jcattanach;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth year: ");

        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle enter key

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            int age = 2019 - yearOfBirth;

            if(age >= 0 && age <= 120){
                System.out.println("your name is " +  name + ", and you are " + age + " years old.");
            } else {
                System.out.println("invalid year of birth...");
            }
        } else {
            System.out.println("Please enter a valid year...");
        }

        scanner.close();


    }
}
