package com.Arghajit;
//Static Polymorphism is also known as Method Overloading. Can be done in 2 ways:By increasing the no.of argument and changed the type of argument
public class Sta_poly_morph {
    public void add(int a, int b){
        System.out.println("Addition will be : " + (a+b));
    }
    public void add(int a, int b, int c){
        System.out.println("Addition will be (overloading detected): " + (a+b+c));      //increased the no.of argument
    }
    public void add(int a, long b){
        System.out.println("Addition will be (overloading detected) : " + (a+b));       //changed the type of argument
    }

    public static void main(String[] args) {
        Sta_poly_morph s = new Sta_poly_morph();
        s.add(2, 3);
        s.add(2,3L);
        s.add(2,3,1);
    }

}
