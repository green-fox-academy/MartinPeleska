// Write a program that asks for a double that is a distance in miles,
// then it converts that value to kilometers and prints it

// Loads the scanner to the file
import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);          // Creates a scanner
        System.out.println("Enter number of miles: ");
        double numberOfMiles= scanner.nextDouble();

        double convertMilesToKm = (numberOfMiles) * (1.609344);

        System.out.println(convertMilesToKm);



    }
}


/*
import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}
 */

