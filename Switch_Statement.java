package com.Arghajit;

import java.util.Scanner;

public class Switch_Statement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scan.nextInt();
        switch(age){
            case 12:
                System.out.println("12 years old");
                break;
            case 20:
                System.out.println("20 years old");
                break;
            case 30:
                System.out.println("30 years old");
                break;
            default:
                System.out.println("No match found");
        }
    }
}
