package com.jcattanach;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount acctOne = new BankAccount();

        acctOne.setBalance(100.00);
        acctOne.setAcctNum(458973);
        acctOne.setName("Jack Cattanach");

        System.out.println(acctOne.getAcctNum());
        System.out.println(acctOne.getBalance());
        System.out.println(acctOne.getName());

        System.out.println(acctOne.deposit(70));
        System.out.println(acctOne.withdraw(90));
        System.out.println(acctOne.withdraw(300));
    }
}
