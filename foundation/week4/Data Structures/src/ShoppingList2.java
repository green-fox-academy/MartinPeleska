import java.util.HashMap;

public class ShoppingList2 {


    public static void main(String[] args) {

// Product List
        HashMap<String, Double> productList = new HashMap<>();
        productList.put("Milk", 1.07);
        productList.put("Rice", 1.59);
        productList.put("Eggs", 3.14);
        productList.put("Cheese", 12.60);
        productList.put("Chicken Breasts", 9.40);
        productList.put("Apples", 2.31);
        productList.put("Tomato", 2.58);
        productList.put("Potato", 1.75);
        productList.put("Onion", 1.10);

//Bob's shopping list
        HashMap<String, Integer> bobsShoppingList = new HashMap<>();
        bobsShoppingList.put("Milk", 3);
        bobsShoppingList.put("Rice", 2);
        bobsShoppingList.put("Eggs", 2);
        bobsShoppingList.put("Cheese", 1);
        bobsShoppingList.put("Chicken Breasts", 4);
        bobsShoppingList.put("Apples", 1);
        bobsShoppingList.put("Tomato", 2);
        bobsShoppingList.put("Potato", 1);

//How much does Bob pay?
        double totalBobsSpending = 0;
        for (double i : productList.values()) {
            //   System.out.println(i);
            totalBobsSpending += i;
        }
        System.out.println("Total Bob's spending:  " + totalBobsSpending);

//Alice's shopping list
        HashMap<String, Integer> alicesShoppingList = new HashMap<>();
        alicesShoppingList.put("Rice", 1);
        alicesShoppingList.put("Eggs", 5);
        alicesShoppingList.put("Chicken Breasts", 2);
        alicesShoppingList.put("Apples", 1);
        alicesShoppingList.put("Tomato", 10);

//How much does Alice pay?
        double totalAlicesSpending = 0;
        for (double i : productList.values()) {
            //   System.out.println(i);
            totalAlicesSpending += i;
        }
        System.out.println("Total Alice's spending:  " + totalAlicesSpending);


//Who buys more Rice?
        if ((bobsShoppingList.get("Rice")) > (alicesShoppingList.get("Rice"))) {
            System.out.println("Bob buys more Rice than Alice.");
        } else {
            System.out.println("Alice buys more Rice than Bob.");
        }
        if ((bobsShoppingList.get("Rice")) == (alicesShoppingList.get("Rice"))) {
            System.out.println("Bod and Alice buy the same volume of Rice");
        }
//Who buys more Potato?
        if ((bobsShoppingList.containsValue("Potato")) && (alicesShoppingList.containsValue("Potato"))) {

            if ((bobsShoppingList.get("Potato")) > (alicesShoppingList.get("Potato"))) {
                System.out.println("Bob buys more Potato than Alice.");
            } else {
                System.out.println("Alice buys more Potato than Bob.");
            }
            if ((bobsShoppingList.get("Potato")) == (alicesShoppingList.get("Potato"))) {
                System.out.println("Bod and Alice buy the same volume of Potato");
            }
        } else {
            System.out.println("Alice or Bob or both don't buy any Potato");
        }
//Who buys more different products?
        if ((bobsShoppingList.size()) > (alicesShoppingList.size())) {
            System.out.println("Bob buys more different products than Alice.");
        } else {
            System.out.println("Alice buys more different products than Bob.");
        }
        if ((bobsShoppingList.get("Potato")) == (alicesShoppingList.get("Potato"))) {
            System.out.println("Bod and Alice buy the same volume of different products");
        }
//Who buys more products? (piece)
        double totalAlicesPieces = 0;
        for (double i : alicesShoppingList.values()) {
            totalAlicesPieces += i;
        }
        System.out.println("Total Alice's buys:  " + totalAlicesPieces);

        double totalBobsPieces = 0;
        for (double i : bobsShoppingList.values()) {
            totalBobsPieces += i;
        }
        System.out.println("Total Bob's buys:  " + totalBobsPieces);

        if (totalBobsPieces > totalAlicesPieces) {
            System.out.println("Bob buys more pieces than Alice");
        } else {
            System.out.println("Alice buys more pieces than Bob");
        }
        if (totalBobsPieces == totalAlicesPieces) {
            System.out.println("Alice and Bod buy the same volume of pieces");
        }
    }
}
