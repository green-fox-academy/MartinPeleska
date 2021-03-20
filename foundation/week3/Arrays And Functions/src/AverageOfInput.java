import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Enter Five Numbers: ");

        int a = scanner1.nextInt();
        int b = scanner1.nextInt();
        int c = scanner1.nextInt();
        int d = scanner1.nextInt();
        int e = scanner1.nextInt();

        int sum = a + b + c + d + e;
        int average = sum / 5;

        System.out.println("Sum: " + sum + "    Average: " + average);



//
//        int c = scanner1.nextInt();5
//        int d = scanner1.nextInt();
//        int e = scanner1.nextInt();




//        System.out.println(a, b, c, d, e);


    }
}
/*
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

 */