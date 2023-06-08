package com.Arghajit;


class Employee {
    int id;
    String name;

    public void printdetails() {
        System.out.println("My Id is " + id);
        System.out.println("My name is " + name);
    }
}
public class Main {
    public static void main(String[] args) {
        // write your code here
        Employee list = new Employee();  //Instantiating a new Employee object
        // Setting attributes
        list.id = 12;
        list.name = "Arghajit";
        // Printing the attributes
        list.printdetails();
        System.out.println(list.id);
    }
}

