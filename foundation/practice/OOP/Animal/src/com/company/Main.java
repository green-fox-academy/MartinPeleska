package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal anim1 = new Animal(50, 50);
    //    Animal anim2 = new Animal(50, 50);

        anim1.drink();
        anim1.eat();
        anim1.play();
    }
}


/*
Create an Animal class
Every animal has a hunger value, which is a whole number
Every animal has a thirst value, which is a whole number
When creating a new animal instance these values must be set to the default 50 value
Every animal can eat() which decreases its hunger by one
Every animal can drink() which decreases its thirst by one
Every animal can play() which increases both its hunger and thirst by one
 */