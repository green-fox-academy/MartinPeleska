/*We are going to represent our expenses in a list containing integers.

        Create a list with the following items.
        500, 1000, 1250, 175, 800 and 120
        Create an application which solves the following problems.
        How much did we spend?
        Which was our greatest expense?
        Which was our cheapest spending?
        What was the average amount of our spendings?

 */
import java.util.ArrayList;
public class PersonalFinance{
    public static void main (String[] args) {
//Create a list with the following items.
//        500, 1000, 1250, 175, 800 and 120
        ArrayList<Integer> listOfExpenses = new ArrayList<>();
        listOfExpenses.add(500);
        listOfExpenses.add(1000);
        listOfExpenses.add(1250);
        listOfExpenses.add(175);
        listOfExpenses.add(800);
        listOfExpenses.add(120);

        System.out.println(listOfExpenses);
        System.out.println(totalSpending(listOfExpenses));
        System.out.println(maxSpending(listOfExpenses));
        System.out.println(minSpending(listOfExpenses));
        System.out.println(averageSpending(listOfExpenses));


    }
    //Create an application which solves the following problems.
    //        How much did we spend?
    public static int totalSpending (ArrayList<Integer> listOfExpenses) {
        int sumNumber = 0;
        for (int number : listOfExpenses) {
            sumNumber += number;
        }
        return sumNumber;
    }
    //Which was our greatest expense?
    public static int maxSpending (ArrayList<Integer> listOfExpenses) {
        int maxSpending = listOfExpenses.get(0);
        for (int number : listOfExpenses) {
            if (maxSpending < number) {
                 maxSpending = number;
            }
        }
        return maxSpending;
    }
    //Which was our cheapest spending
    public static int minSpending (ArrayList<Integer> listOfExpenses) {
        int minSpending = listOfExpenses.get(0);
        for (int number : listOfExpenses) {
            if (minSpending > number) {
                minSpending = number;
            }
        }
        return minSpending;

    }
    //What was the average amount of our spendings?
    public static int averageSpending (ArrayList<Integer> listOfExpenses) {
        int averageNumber = 0;
        for (int number : listOfExpenses) {
            averageNumber += number;
        }
        return (averageNumber / listOfExpenses.size());
    }
}
