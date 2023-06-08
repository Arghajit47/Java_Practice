package com.Arghajit;

import java.util.HashMap;


public class Mapping {
    public static void main(String[] args) {
        HashMap<String, Integer> ebook= new HashMap<String, Integer>();
        ebook.put("Arghajit", 790);
        ebook.put("Srikant", 898);
        ebook.put("Srishant", 466);
        ebook.put("Sriram", 875);
        ebook.put("Srinivas", 272);
        System.out.println(ebook.get("Arghajit"));
        System.out.println(ebook);
        ebook.remove("Srikant");
        System.out.println(ebook.containsKey("Sriram"));
        System.out.println(ebook.containsValue("Sriram"));
        System.out.println(ebook.containsValue(790));
        System.out.println(ebook.size());
        ebook.replace("Sriram",780);
        System.out.println(ebook);
        System.out.println(ebook.values());
        System.out.println(ebook.keySet());


    }

}
