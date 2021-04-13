/*
Create a Sponsor class that has the same fields and methods as the Person class, and has the following additional

fields:
company: name of the company
hiredStudents: number of students hired
method:
introduce(): "Hi, I'm name, a age year old gender who represents company and hired hiredStudents students so far."
hire(): increase hiredStudents by 1
getGoal(): prints out "Hire brilliant junior software developers."
The Sponsor class has the following constructors:

Sponsor(name, age, gender, company): beside the given parameters, it sets hiredStudents to 0
Sponsor(): sets name to Jane Doe, age to 30, gender to female, company to Google and hiredStudents to 0
 */
package com.company;
public class Sponsor {
    //constructors
    public Sponsor(String name, int age, String gender, String company){
        name = "Jane Doe";
        age = 30;
        gender = "female";
        company = "Google";
        hiredStudents = 0;
    }


    //fields
    String name;         //the name of the person
    int age;             //the age of the person (whole number)
    String gender;       //the gender of the person (male / female)
    String company;      //name of the company
    int hiredStudents;   //number of students hired

    public void introduce(){
        System.out.println("Hi, I'm name, a age year old gender who represents company and hired hiredStudents students so far.");
    }
    public void getGoal(){
        System.out.println("My goal is: Live for the moment!");
    }
    public void hire(){            //increase hiredStudents by 1
        System.out.println(hiredStudents +1);
    }
}
