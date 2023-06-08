package com.Arghajit;

class myemployee{
    private int id;
    private String name;

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
public class modifiers {
    public static void main(String[] args) {
        myemployee Arghajit = new myemployee();
        Arghajit.setId(45);
        Arghajit.setName("Arghajit");
        System.out.println(Arghajit.getName());
        System.out.println(Arghajit.getId());
    }
}
