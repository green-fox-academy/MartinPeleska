import java.util.Scanner;  // Import the Scanner class

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet the User instead of the World!
        // The program should ask for the name of the User
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your name:");

        String userName = myObj.nextLine();  // Read user input

        System.out.println("Hello, " + userName);  // Output user input


    }
}



