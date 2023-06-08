package com.Arghajit;

import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Name");
        String name = scan.nextLine();
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter The Location");
        String loc = scan1.nextLine();
        System.out.println(name + " is doing Java core");
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name + " is from \t" + loc);
        System.out.println(name + "is from \n" + loc);
        System.out.println(name.contains("Arg"));
        System.out.println(name.charAt(2));
        System.out.println(name.endsWith("rg"));
        System.out.println(name.indexOf("Arg"));
    }
}
