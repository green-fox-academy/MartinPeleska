package com.company;

public class Animal {
    int thirst;
    int hunger;

    public Animal(int hunger, int thirst){

        this.hunger = hunger;
        this.thirst = thirst;
    }
    public void eat()
    {
        int eat = hunger -1;
        System.out.println("hunger: " + eat);
    }
    public void drink()
    {
        int drink = thirst -1;
        System.out.println("thirst: " + drink);
    }
    public void play()
    {
        int playHunger = hunger + 10;
        int playThist = thirst +10;
        System.out.println("hunger: " + playHunger + "   thirst: " + playThist);
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