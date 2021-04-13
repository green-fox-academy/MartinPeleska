/*
Create a Person class with the following fields:

name: the name of the person
age: the age of the person (whole number)
gender: the gender of the person (male / female)
And the following methods:

introduce(): prints out "Hi, I'm name, a age year old gender."
getGoal(): prints out "My goal is: Live for the moment!"
And the following constructors:

Person(name, age, gender)
Person(): sets name to Jane Doe, age to 30, gender to female
 */
package com.company;
public class Person {

    //constructors
    public Person (String name, int age, String gender){
        name = "Jane Doe";
        age = 30;
        gender = "female";
    }
    //constructor 2
    Person("Jane Doe"): sets name to Jane Doe, age to 30, gender to female


    //fields
    String name;         //the name of the person
    int age;             //the age of the person (whole number)
    String gender;       //the gender of the person (male / female)

    public void introduce(){
        System.out.println("Hi, I'm name, a age year old gender.");
    }
    public void getGoal(){
        System.out.println("My goal is: Live for the moment!");
    }

}
