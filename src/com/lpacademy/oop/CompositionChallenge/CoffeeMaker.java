package com.lpacademy.oop.CompositionChallenge;

public class CoffeeMaker extends Appliance {
    public CoffeeMaker() {
    }

    public CoffeeMaker(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void brewCoffee(){
        if (this.getHasWorkToDo()) {
            System.out.println("""
                        Your coffee is ready! ☕
                        Freshly brewed and waiting for you to enjoy.
                        Time to savor the perfect cup!""");
            this.setHasWorkToDo(false);
        }
    }
}
