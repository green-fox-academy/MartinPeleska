/*
We are going to represent a shopping list in a list containing strings.

Create a list with the following items.
Eggs, milk, fish, apples, bread and chicken
Create an application which solves the following problems.
Do we have milk on the list?
Do we have bananas on the list?
 */
import java.util.ArrayList;
public class ShoppingList {
    public static void main (String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("eggs");
        shoppingList.add("milk");
        shoppingList.add("fish");
        shoppingList.add("apples");
        shoppingList.add("bread");
        shoppingList.add("chicken");
        System.out.println(shoppingList);

//Do we have milk on the list?

        if(shoppingList.contains("milk")){
            System.out.println("The shopping list contains the item MILK");
        }  else
            System.out.println("The shopping list does NOT contains the item MILK");

        //Do we have bananas on the list?
        if(shoppingList.contains("bananas")){
            System.out.println("The shopping list contains the item BANANAS");
        }  else
            System.out.println("The shopping list does NOT contains the item BANANAS");

        }

    }

