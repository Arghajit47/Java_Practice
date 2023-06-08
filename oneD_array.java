package com.Arghajit;

public class oneD_array {
    public static void main(String[] args) {
        // To store multiple values of the same datatype, We use array
        int [] marks = {19,45,37,87};
        System.out.println(marks[2]);
        marks[3] = 67;
        System.out.println(marks[3]);
        System.out.println();
        for (int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
            System.out.println();
            // Classical way
        for (int value:marks) {
            System.out.println(value);
            //For each loop way
        }
        }
    }
}
