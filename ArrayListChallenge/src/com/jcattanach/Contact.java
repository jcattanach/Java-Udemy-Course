package com.jcattanach;

public class Contact {
    private String name;
    private String number;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.number = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public static Contact creatContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }
}
