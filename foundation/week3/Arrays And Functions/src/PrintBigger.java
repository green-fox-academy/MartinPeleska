import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (a > b) {
            System.out.println( a + "is bigger than" + b);
        } else {
            System.out.println( b + "is bigger than" + a);
        }

    }
}


