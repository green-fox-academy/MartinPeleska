/*
Create an Animal class
Every animal has a hunger value, which is a whole number
Every animal has a thirst value, which is a whole number
When creating a new animal instance these values must be set to the default 50 value
Every animal can eat() which decreases its hunger by one
Every animal can drink() which decreases its thirst by one
Every animal can play() which increases both its hunger and thirst by one
 */
public class Animal {
    int hunger;
    int thirst;
    int game;

    public Animal( int hunger, int thirst, int game) {
        this.hunger = hunger;
        this.thirst = thirst;
        this.play = game;
    }



    public Animal() {                  //Contructor

    }

    public void eat() {
        System.out.println(hunger -1);
        

    }
    public void drink() {
        System.out.println(thirst -1);

    }
    public void play() {
        System.out.println(game + 1);

    }
}

public class Animals {
    public static void main (String[] args) {
        Animal fox;
        fox = new Animal();

        tom.hunger = 50;
        tom.thirst = 50;
        tom.game = 50;

        fox.eat();
        fox.drink();
        fox.play();

    }
}
