import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b < a) {
            System.out.println("The second number should be bigger.");
        } else {
            for (int i = a; i <= b; i++) {
                System.out.println(i); // Prints the numbers from 0 to 99
            }

        }

    }
}




// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5