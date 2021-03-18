import java.util.Scanner;  // Import the Scanner class


public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner scanner1 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter number of chickens: ");
        int numberOfChickens = scanner1.nextInt();  // Read user input

        Scanner scanner2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter number of pigs: ");
        int numberOfPigs = scanner2.nextInt();

        int numberOfAllLegs = (numberOfChickens + numberOfPigs) * 4;

        System.out.println("All the animals have : " + numberOfAllLegs + "legs.");  // Output user input
    }
}

