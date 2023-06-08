package com.Arghajit;

abstract class parent{
    public parent(){
        System.out.println("Constructor 1");    //Constructor
    }
    public void sayhello(){
        System.out.println("Hello");    // Method 1
    }
    abstract public void greet1();
    abstract public void greet2();
    }

class child extends parent{

    @Override
    public void greet1() {
        System.out.println("How are you?");
    }

    @Override
    public void greet2() {
        System.out.println("I mean How's the day?");

    }
}
abstract class grandchild extends parent{
    public void greet3(){
        System.out.println("I am Ok but it's been a long day!");
    }
}
public class Ab_class {
    public static void main(String[] args) {
        child c = new child();
        //grandchild gc = new grandchild();     //error



    }
}
