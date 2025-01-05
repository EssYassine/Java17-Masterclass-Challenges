package com.lpacademy.oop.BillsBurger;

public class DeluxeBurger extends Burger{

    private MealItem deluxe1, deluxe2;

    public DeluxeBurger(String type) {
        super(type);
    }

    public void addToppings(String extra_1, String extra_2, String extra_3, String extra_4, String extra_5) {
        super.addToppings(extra_1, extra_2, extra_3);
        deluxe1 = new MealItem(extra_4, 0);
        deluxe2 = new MealItem(extra_5, 0);
    }

    @Override
    public void printItemizedList(MealItem extra) {
        super.printItemizedList(extra);
        if (deluxe1 != null) {
            deluxe1.printItem();
        }
        if (deluxe2 != null) {
            deluxe2.printItem();
        }
    }

    @Override
    public double getExtraPrice(String topping) {
        return 0;
    }
}
