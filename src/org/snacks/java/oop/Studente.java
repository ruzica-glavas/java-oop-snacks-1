package org.snacks.java.oop;

public class Studente {
    private String name;
    private String lastName;
    private int age;

    public Studente(String name, String lastName, int age){
        
        this.name=name;
        this.lastName=lastName;
        this.age=age;

    }

    public String getName(){
        return this.name;
    }

    public void setName (String name){
        this.name=name;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName (String lastName){
        this.name=lastName;
    }

    public int age(){
        return this.age;
    }

    public void age (int age){
        this.age=age;
    }


    public String getStudent (){
        //return name + " " + lastName + "," + age;
        return String.format("%s %s, %d", this.name, this.lastName, this.age);
    }

}
