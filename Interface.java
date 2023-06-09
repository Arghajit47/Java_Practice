package com.Arghajit;

interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    int x = 45;
    void blowHornpee();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{
    //public int x = 5;
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUP");
    }
    public void blowHornpee(){
        System.out.println("pee pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naa po po po po");
    }
}
public class Interface {
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBrake(1);
        // You can create properties in Interfaces
        System.out.println(cycle.a);
        System.out.println(cycle.x);

        // Cannot modify the properties in Interfaces as they are final

        cycle.blowHornpee();
        cycle.blowHornmhn();
    }
}
