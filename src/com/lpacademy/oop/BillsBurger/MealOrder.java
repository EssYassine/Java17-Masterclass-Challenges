package com.lpacademy.oop.BillsBurger;

import java.util.Objects;

public class MealOrder {

    private Burger burger;
    private Drink drink;
    private Side sideItem;

    public MealOrder() {
        this.burger = new Burger("Regular");
        this.drink = new Drink("Coke", "SMALL");
        this.sideItem = new Side("Fries");
    }

    public MealOrder(Burger burger, Drink drink, Side sideItem) {
        if (burger instanceof DeluxeBurger db) {

        }
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public void setDrinkSize(String size) {
        this.drink.setSize(size);
    }

    public double getTotalPrice(){
        return burger.getBasePrice() + drink.getBasePrice() + sideItem.getBasePrice();
    }

    public void printItemizedList() {
        burger.printItem();
        drink.printItem();
        sideItem.printItem();
        System.out.println("-".repeat(30));
        System.out.printf("%20s:%6.2f$%n", "TOTAL PRICE", getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3){
        burger.addToppings(extra1, extra2, extra3);
    }

}
