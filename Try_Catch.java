package com.Arghajit;

public class Try_Catch {
    public static void main(String[] args) {
        String [] cars = {"BMW", "Maruti", "Suzuki", "Tata"};
        try {
            System.out.println(cars[4]);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Do it");
        }

    }
}
