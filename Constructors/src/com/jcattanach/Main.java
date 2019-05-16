package com.jcattanach;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount acctOne = new BankAccount("Jack Cattanach", 777123, 100);

        System.out.println(acctOne.getAcctNum());
        System.out.println(acctOne.getBalance());
        System.out.println(acctOne.getName());

        System.out.println(acctOne.deposit(70));
        System.out.println(acctOne.withdraw(90));
        System.out.println(acctOne.withdraw(300));
    }
}
