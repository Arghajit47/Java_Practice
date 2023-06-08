package com.Arghajit;

class mymainemployee {
    private int id;
    private String name;

    public mymainemployee(){
        id = 45;
        name = "Your Name";

    }

    public mymainemployee(String myname, int myid){
        id = myid;
        name = myname;

}

    public String getName() {
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId(){
        return id;

    }
}

public class Constructors {
    public static void main(String[] args) {
        mymainemployee Arghajit = new mymainemployee("Arghajit", 23);
        //Arghajit.setId(45);
        //Arghajit.setName("Arghajit");
        System.out.println(Arghajit.getName());
        System.out.println(Arghajit.getId());

    }
}
