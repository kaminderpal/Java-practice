package org.example;

interface Transport {
    void getSetGo();
}

public abstract class Vehicle implements  Transport {

    private int noOfTires;

    public abstract void makeStartSound();


    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    @Override
    public void getSetGo() {
        System.out.println("We are leaving now...");
    }

}