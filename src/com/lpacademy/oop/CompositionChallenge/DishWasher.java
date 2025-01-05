package com.lpacademy.oop.CompositionChallenge;

public class DishWasher extends Appliance {

    public DishWasher() {}

    public DishWasher(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void doDishes(){
        if (this.getHasWorkToDo()) {
            System.out.println("""
                    Dishwashing complete! 🧽✨
                    Your dishes are now sparkling clean and ready to use.
                    Great job keeping things tidy!""");
            this.setHasWorkToDo(false);
        }
    }
}
