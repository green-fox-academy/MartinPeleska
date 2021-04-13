/*
Create a Mentor class that has the same fields and methods as the Person class, and has the following additional

fields:
level: the level of the mentor (junior / intermediate / senior)
methods:
getGoal(): prints out "Educate brilliant junior software developers."
introduce(): "Hi, I'm name, a age year old gender level mentor."
The Mentor class has the following constructors:

Mentor(name, age, gender, level)
Mentor(): sets name to Jane Doe, age to 30, gender to female, level to intermediate
 */
package com.company;
public class Mentor {

    //constructors
    public Mentor(String name, int age, String gender, String level) {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        level = "intermediate";
    }


        //fields
        String name;         //the name of the person
        int age;             //the age of the person (whole number)
        String gender;       //the gender of the person (male / female)
        String level;        //the level of the mentor (junior / intermediate / senior)



        public void introduce(){
            System.out.println("Hi, I'm name, a age year old gender level mentor.");
        }
        public void getGoal () {
            System.out.println("Educate brilliant junior software developers.");
        }
    }
