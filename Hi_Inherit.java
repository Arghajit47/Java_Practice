package com.Arghajit;

//parent class
class GrandFather
{
    public void show()
    {
        System.out.println("I am grandfather.");
    }
}
//inherits GrandFather properties
class Father extends GrandFather
{
    public void show()
    {
        System.out.println("I am father.");
    }
}
//inherits Father properties
class Son extends Father
{
    public void show()
    {
        System.out.println("I am son.");
    }
}
//inherits Father properties
public class Hi_Inherit extends Father
{
    public void show()
    {
        System.out.println("I am a daughter.");
    }
    public static void main(String args[])
    {
        Hi_Inherit daughter = new Hi_Inherit();
        daughter.show();

    }
}