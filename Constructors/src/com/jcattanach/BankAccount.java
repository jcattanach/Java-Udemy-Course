package com.jcattanach;

public class BankAccount {

    // This is the constructor, which can be overloaded...
    // can call this() and that is a good way to add default options. It calls the other constructor function

    public BankAccount(){
        this("default name", 11111, 5);
    }

    public BankAccount(String name, int acctNum, double balance) {
        this.acctNum = acctNum;
        this.balance = balance;
        this.name = name;
    }

    // ****************

    private int acctNum;
    private double balance;
    private String name;

    public void setAcctNum(int acctNum){
        this.acctNum = acctNum;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public int getAcctNum() {
        return acctNum;
    }

    public String getName() {
        return name;
    }

    public String withdraw(double amount){
        if(amount < this.balance){
            double newBalance = this.balance - amount;
            this.setBalance(newBalance);
            return "Your new balance is " + Double.toString(newBalance);
        } else {
            return "Insufficient Funds";
        }
    }

    public String deposit(double amount){
        double newBalance = this.balance + amount;
        this.setBalance(newBalance);
        return "Your new balance is " + Double.toString(newBalance);
    }
}
