/*
We are going to represent our products in a map where the keys are strings representing the product's name and the values are numbers representing the product's price.

Create a map with the following key-value pairs.

Product name (key)	Price (value)
Eggs	200
Milk	200
Fish	400
Apples	150
Bread	50
Chicken	550
Create an application which solves the following problems.

How much is the fish?
What is the most expensive product?
What is the average price?
How many products' price is below 300?
Is there anything we can buy for exactly 125?
What is the cheapest product?
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ProductDatabase {
    public static void main(String[] args) {

        //product list
        HashMap<String, Integer> productList = new HashMap<>();
        productList.put("Eggs", 200);
        productList.put("Milk", 200);
        productList.put("Fish", 400);
        productList.put("Apples", 125);//150
        productList.put("Bread", 50);
        productList.put("Chicken", 125);  //550

// How much is the fish?
        System.out.println("The price of the Fish is: " + productList.get("Fish"));

//What is the most expensive product?

        int priceOftheMostExpensiveProduct = 0;
        Set<String> nameOfTheMostExpensiveProduct = null;
        for (int j : productList.values()) {
            if (priceOftheMostExpensiveProduct < j) {
                priceOftheMostExpensiveProduct = j;
            }
            continue;
        }
        // value whose key is to be searched
        Integer value = priceOftheMostExpensiveProduct;

        // iterate each entry of hashmap
        for (Entry<String, Integer> entry : productList.entrySet()) {

            // if give value is equal to value from entry
            // print the corresponding key
            if (entry.getValue().equals(value)) {
                System.out.println("The most expensive product for  " + value + " is " + entry.getKey());
                break;
            }
        }
//What is the average price?
        int averagePrice = 0;
        int totalPrice = 0;
        //  int v = 0;
        for (int v : productList.values()) {
            totalPrice += v;

        }
        System.out.println("Total price :" + totalPrice);
        System.out.println("Average price: " + (totalPrice / productList.size()));

//How many products' price is below 300?
        int count = 0;

        int productsBellow300 = 0;
        for (int i : productList.values()) {
            if (i < 300) {
                count += 1;
            }
            continue;
        }
        System.out.println(count);

//Is there anything we can buy for exactly 125?
        int count2 = 0;
        for (int j : productList.values()) {
            if (j == 125) {
                count2 += 1;
            }
            continue;

        }
        System.out.println("Number of products for 125: " + count2);

//What is the cheapest product?
        int priceOftheChepestProduct = 1000000;
        Set<String> nameOfTheCheapestProduct = null;
        for (int price : productList.values()) {
            if ( priceOftheChepestProduct > price) {
                priceOftheChepestProduct = price;
            }
            continue;
        }
        // value whose key is to be searched
        Integer value2 = priceOftheChepestProduct;

        // iterate each entry of hashmap
        for (Entry<String, Integer> entry : productList.entrySet()) {

            // if give value is equal to value from entry
            // print the corresponding key
            if (entry.getValue().equals(value2)) {
                System.out.println("The cheapest product for  " + value2 + " is " + entry.getKey());
                break;
            }
        }
    }
}


/*
// value whose key is to be searched
    Integer value = 3;

    // iterate each entry of hashmap
    for(Entry<String, Integer> entry: numbers.entrySet()) {

      // if give value is equal to value from entry
      // print the corresponding key
      if(entry.getValue() == value) {
        System.out.println("The key for value " + value + " is " + entry.getKey());
        break;
      }
    }



What is the most expensive product?
What is the average price?
How many products' price is below 300?
Is there anything we can buy for exactly 125?
What is the cheapest product?
 */