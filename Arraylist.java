package com.Arghajit;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>(1000);
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(0,1);                 //add element into array in specific index
        l1.add(1,2);
        l1.add(2,3);
        l1.add(4);                                // add element in array as per input sequence
        l1.add(4);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l1.addAll(l2);                                    //To append to arrays
        System.out.println(l1.contains(7));              //Checks whether the Array contains specific element
        System.out.println(l1.indexOf(4));              //Shows the first index of the no. in an array
        System.out.println(l1.lastIndexOf(4));      //Shows the last index where the no. is present at the array
        l1.remove(2);                               //Removing an element from specific index
        //l1.clear();                                   //Clearing the Array
        l1.set(1, 566);                                     // Updating the Value at specific index
        for (int i=0; i< l1.size(); i++){
            System.out.print(l1.get(i));                // Printing the Array
            System.out.print(", ");
        }
    }
}
