package com.Arghajit;

class Base{

    Base(){
        System.out.println("I am Base class");
    }
    Base(int a){
        System.out.println("I am overloading the base constructor "+ a);
    }
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    Derived(){
        super(0);
        System.out.println("I am Derived class");
    }


    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class S_Inherit {
    public static void main(String[] args) {
        // Creating an Object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // Creating an object of derived class
        Derived a = new Derived();
        a.setX(14);
        System.out.println(a.getX());
        a.printMe();

        // Creating an object of derived class
        Derived d = new Derived();
        d.setY(43);
        System.out.println(d.getY());

    }
}

