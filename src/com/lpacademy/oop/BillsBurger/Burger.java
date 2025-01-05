package com.lpacademy.oop.BillsBurger;

public class Burger extends MealItem{

    // private String toppings = "no toppings";
    private MealItem extra_1, extra_2, extra_3;

    public Burger(String type) {
        super(type.toUpperCase(), calculateBasePrice(type));
    }

    @Override
    public String getType() {
        return super.getType() + " BURGER";
    }

    private static double calculateBasePrice(String type) {
        return switch(type) {
            case "CLASSIC BEEF", "CHEESE" -> 6.00;
            case "DOUBLE CHEESE", "BACON" -> 8.00;
            case "HAWAIIAN", "AVOCADO" -> 9.50;
            default -> 7.0;
        };
    }

    @Override
    public void printItem() {

        System.out.printf("%20s:%6.2f$%n", "BASE BURGER", getBasePrice());
        printItemizedList(extra_1);
        printItemizedList(extra_2);
        printItemizedList(extra_3);
        System.out.println("-".repeat(30));
        System.out.printf("%20s:%6.2f$%n", getType(), getAdjustedPrice());
    }

    public double getAdjustedPrice() {
        return getBasePrice() +
                ((extra_1 == null) ? 0 : extra_1.getBasePrice()) +
                ((extra_2 == null) ? 0 : extra_2.getBasePrice()) +
                ((extra_3 == null) ? 0 : extra_3.getBasePrice());
    }

    public void printItemizedList(MealItem extra) {
        if (extra != null) {
            extra.printItem(extra.getType());
        }
    }

    public double getExtraPrice(String topping) {
        return switch (topping.toUpperCase()) {
            case "AVOCADO", "CHEESE" -> 1.0;
            case "BACON", "HAM", "SALAMI" -> 1.5;
            default -> 0.0;
        };
    }

    public void addToppings(String extra_1, String extra_2, String extra_3){
        this.extra_1 = new MealItem(extra_1, getExtraPrice(extra_1));
        this.extra_2 = new MealItem(extra_2, getExtraPrice(extra_2));
        this.extra_3 = new MealItem(extra_3, getExtraPrice(extra_3));
    }
}
