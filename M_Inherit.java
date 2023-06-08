package com.Arghajit;

//super class
class Student
{
    int reg_no;
    void getNo(int no)
    {
        reg_no=no;
    }
    void putNo()
    {
        System.out.println("registration number= "+reg_no);
    }
}
//intermediate sub class
class Marks extends Student
{
    float marks;
    void getMarks(float m)
    {
        marks=m;
    }
    void putMarks()
    {
        System.out.println("marks= "+marks);
    }
}
//derived class
class Sports extends Marks
{
    float score;
    void getScore(float scr)
    {
        score=scr;
    }
    void putScore()
    {
        System.out.println("score= "+score);
    }
}
public class M_Inherit
{
    public static void main(String args[])
    {
        Sports ob=new Sports();
        ob.getNo(987);
        ob.putNo();
        ob.getMarks(78);
        ob.putMarks();
        ob.getScore(68.7f);
        ob.putScore();
    }
}
