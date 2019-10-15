package com.jcattanach;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelade");
        bank.addCustomer("Adelade", "Tim", 50.05);
        bank.addCustomer("Adelade", "Mike", 175.34);
        bank.addCustomer("Adelade", "Percy", 220.12);
        bank.addBranch("Sydney");
        bank.addCustomer("Sydney","Bob", 150.54);

        bank.addCustomerTransaction("Adelade", "Tim", 44.22);
        bank.addCustomerTransaction("Adelade", "Tim", 12.24);
        bank.addCustomerTransaction("Adelade", "Mike", 1.65);

        bank.listCustomers("Adelade", true);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");
        if(!bank.addCustomer("Melbourne", "Brian", 5.53)){
            System.out.println("Error: Melbourne branch does not exist");
        }

        if(!bank.addBranch("Adelade")){
            System.out.println("Error: Branch already exists");
        }
    }
}
