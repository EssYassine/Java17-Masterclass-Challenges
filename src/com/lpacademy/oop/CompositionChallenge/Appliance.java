package com.lpacademy.oop.CompositionChallenge;

public class Appliance {
    private boolean hasWorkToDo;

    public Appliance() {
        hasWorkToDo = false;
    }

    public Appliance(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean getHasWorkToDo(){
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }
}
