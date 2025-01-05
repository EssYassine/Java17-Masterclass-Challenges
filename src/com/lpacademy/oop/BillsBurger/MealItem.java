package com.lpacademy.oop.BillsBurger;

public class MealItem {

    private String type;
    private double price;

    public MealItem(String type, double price) {
        this.type = type.toUpperCase();
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getBasePrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printItem() {
        printItem(type, "REGULAR");
    }

    public void printItem(String type) {
        printItem(type, "");
    }

    public void printItem(String type, String size) {
        String itemDescription = size.isEmpty() ? type : size + " " + type;
        System.out.printf("%20s:%6.2f$%n", itemDescription, price);
    }
}
