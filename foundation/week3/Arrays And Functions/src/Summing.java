// Create the usual class wrapper and main method on your own

// Write a function called `sum()` that returns the sum of numbers from zero to the given parameter

public class Summing {
    public static void main(String[] args) {

        int givenNumber = 3;
        System.out.println(sum(givenNumber));
    }

    public static int sum(int input) {                   //  ?????
        int sumOfNumbers = 0;
        for (int i = 0; i <= input; i++) {
            sumOfNumbers = sumOfNumbers + i;
        }
        return sumOfNumbers;
    }
}




/*
import java.util.Scanner;

public class Summing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenParameter = scanner.nextInt();
        System.out.println(sum(givenParameter));
    }

    public static int sum(int input) {
        int sum = 0;
        for (int i = 0; i <= input; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
 */