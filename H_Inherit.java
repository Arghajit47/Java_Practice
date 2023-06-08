package com.Arghajit;

//parent class
class Student1
{
    public void methodStudent()
    {
        System.out.println("The method of the class Student invoked.");
    }
}
class Science extends Student1
{
    public void methodScience()
    {
        System.out.println("The method of the class Science invoked.");
    }
}
class Commerce extends Student1
{
    public void methodCommerce()
    {
        System.out.println("The method of the class Commerce invoked.");
    }
}
class Arts extends Student1
{
    public void methodArts()
    {
        System.out.println("The method of the class Arts invoked.");
    }
}
public class H_Inherit {
    public static void main(String args[])
    {
        Science sci = new Science();
        Commerce comm = new Commerce();
        Arts art = new Arts();
//all the sub classes can access the method of super class
        sci.methodStudent();
        comm.methodStudent();
        art.methodStudent();
    }
}

