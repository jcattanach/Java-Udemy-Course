package com.jcattanach;

public class Printer {

    private int tonerLevel;
    private int NumberOfPagesPrinted = 0;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if(tonerLevel > 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        this.duplexPrinter = duplexPrinter;
    }

    public void printPages(int pages){
        System.out.println("Prinitng " + pages + " pages..");
        this.NumberOfPagesPrinted = this.NumberOfPagesPrinted + pages;
    }

    public void fillToner(int tonerAdded){
        this.tonerLevel = this.tonerLevel + tonerAdded;

        if(this.tonerLevel >= 100){
            this.tonerLevel = 100;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return NumberOfPagesPrinted;
    }

}
