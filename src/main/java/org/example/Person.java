package org.example;

public class Person {
    String firstname;
    String lastname;
    int age;
    String gender;
    String hair;
    String eyes;

    public Person(String firstname,String lastname,int age){
        this("null","null","null");
        this.firstname = firstname;
        this.lastname=lastname;
        this.age=age;
    }
    public Person(String gender,String hair,String eyes){
        this.gender = gender;
        this.hair = hair;
        this.eyes = eyes;
    }

    public Person() {

    }

    public String getFirstName(){
        return firstname;
    }
    public String getLastName(){
        return lastname;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        if(age>=13 && age<=19){
            return true;
        }
        return false;
    }
}
