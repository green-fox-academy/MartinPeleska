/*


Every animal can eat() which decreases its hunger by one
Every animal can drink() which decreases its thirst by one
Every animal can play() which increases both its hunger and thirst by one
 */


public class Animal1 {            //Create an Animal class

    int hunger = 50;                //Every animal has a hunger/thirst value, which is a whole number
    int thirst = 50;                //When creating a new animal instance these values must be set to the default 50 value

    public Animal1() {
    }

    public void eat() {
        System.out.println("hunger: " + (hunger - 1));
    }

    public void drink() {
        System.out.println("thirst: " + (thirst - 1));
    }

    public void play() {
        System.out.println("playHunger: " + (hunger + 1));
        System.out.println("playThirst: " + (thirst + 1));
    }
}
