package com.jcattanach;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50, false);

        System.out.println(printer.getNumberOfPagesPrinted());
        printer.printPages(10);
        System.out.println(printer.getNumberOfPagesPrinted());

        System.out.println(printer.getTonerLevel());
        printer.fillToner(70);
        System.out.println(printer.getTonerLevel());

    }
}
