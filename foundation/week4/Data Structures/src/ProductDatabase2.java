/*
We are going to represent our products in a map where the keys are strings
representing the product's name and the values are numbers representing the product's price.

Create a map with the following key-value pairs.

Product name (key)	Price (value)
Eggs	200
Milk	200
Fish	400
Apples	150
Bread	50
Chicken	550
Create an application which solves the following problems.

Which products cost less than 201? (just the name)
Which products cost more than 150? (name + price)
 */
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class ProductDatabase2 {
    public static void main(String[] args) {
// Product list
        HashMap<String, Integer> productList = new HashMap<>();
        productList.put("Eggs", 200);
        productList.put("Milk", 200);
        productList.put("Fish", 400);
        productList.put("Apples", 150);
        productList.put("Bread", 50);
        productList.put("Chicken", 550);

//Which products cost less than 201? (just the name)


        //int productsBellow201 = 0;
        //int price = 0;
        for ( int productsBellow201 : productList.values()) {
            if (productsBellow201 < 201) {
                // value whose key is to be searched
                Integer value = productsBellow201;

                // iterate each entry of hashmap
                for (Entry<String, Integer> entry : productList.entrySet()) {

                    // if give value is equal to value from entry
                    // print the corresponding key
                    if (entry.getValue().equals(value)) {
                        System.out.println(entry.getKey());
                        break;
                    }
                }
                continue;
            }

        }

//Which products cost more than 150? (name + price)
        for ( int productsCostsMoreThan150 : productList.values()) {
            if (productsCostsMoreThan150 > 150) {
                // value whose key is to be searched
                Integer value = productsCostsMoreThan150;

                // iterate each entry of hashmap
                for (Entry<String, Integer> entry : productList.entrySet()) {

                    // if give value is equal to value from entry
                    // print the corresponding key
                    if (entry.getValue().equals(value)) {
                        System.out.println(entry.getKey() + " : " + value);
                        break;
                    }
                }
                continue;
            }

        }

    }
}
