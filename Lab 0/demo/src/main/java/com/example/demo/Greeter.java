package com.example.demo;

public class Greeter {
    private String name;

    public void setName(String name){
       this.name  = name;
    }
    public String getGreeting(){
       return ("Hello World from " + name);
      //  System.out.println("Hello World from " + name);
    }
}
