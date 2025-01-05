package com.lpacademy.oop.CompositionChallenge;

public class Refrigerator extends Appliance {

    public Refrigerator(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public Refrigerator() {

    }

    public void orderFood() {
        if (this.getHasWorkToDo()) {
            System.out.println("""
                        Your order has been successfully placed. 🎉
                        You'll be notified once it's on its way. Bon appétit!""");
            this.setHasWorkToDo(false);
        }
    }
}
