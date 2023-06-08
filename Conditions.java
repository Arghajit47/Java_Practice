package com.Arghajit;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = scan.nextInt();
        if (age<5) {
            System.out.println("You are a Kid");
        }
        else if (age == 17) {
            System.out.println("You will be Entering into Adulthood");
        }
        else {
            System.out.println("You are an Adult");
        }
    }
}
