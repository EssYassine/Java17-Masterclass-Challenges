package com.lpacademy.oop.BillsBurger;

public class Drink extends MealItem{

    private String size;

    public Drink() {
        this("COKE", "SMALL");
    }

    public Drink(String type, String size) {
        super(type, calculatePrice(size));
        this.size = size;
    }

    public void setSize(String size) {
        this.size = size.toUpperCase();
        super.setPrice(calculatePrice(size));
    }

    private static double calculatePrice(String size) {
        return switch (size.toUpperCase()) {
            case "SMALL" -> 1.50;
            case "MEDIUM" -> 2.50;
            case "LARGE" -> 3.50;
            default -> 0.00;
        };
    }

    @Override
    public void printItem() {
        super.printItem(super.getType(), size);
    }
}
