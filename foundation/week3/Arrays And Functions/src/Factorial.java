//  Create the usual class wrapper and main method on your own

// - Create a function called `calculateFactorial()`
//   that returns the factorial of its input


import java.util.Scanner;

public class Factorial {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int inputNumber = scanner.nextInt();
        System.out.println(calculateFactorial(inputNumber));

    }
    public static int calculateFactorial(int input) {
        int factorialOfInputNumber = 1;
        for (int i = 1; i <= input; i++) {
            factorialOfInputNumber = factorialOfInputNumber * i;
        }
        return factorialOfInputNumber;
    }
}

// 5! = 5 · 4 · 3 · 2 · 1 = 120
