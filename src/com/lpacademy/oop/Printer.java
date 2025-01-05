package com.lpacademy.oop;

public class Printer {
    private int tonerLevel;
    private int paperPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        int tempAmount = tonerLevel + tonerAmount;
        if (tempAmount > 100 || tempAmount < 0) {
            return -1;
        }
        tonerLevel += tempAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {
        int calculatedPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        paperPrinted += calculatedPages;
        return calculatedPages;
    }

    public int getPaperPrinted() {
        return paperPrinted;
    }
}
