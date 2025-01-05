package com.lpacademy.oop.BillsBurger;

public class Side extends MealItem{

    public Side(String type) {
        super(type, calculatePrice(type));
    }

    private static double calculatePrice(String type){
        return switch (type.toLowerCase()) {
            case "french fries", "salad" -> 3.00;
            case "onion rings" -> 4.00;
            case "mozzarella sticks", "chicken nuggets" -> 4.50;
            case "coleslaw" -> 2.50;
            default -> 3.50;
        };
    }


}
