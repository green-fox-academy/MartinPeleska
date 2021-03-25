/*
Create a map where the keys are strings and the values are strings with the following initial values

Key	Value
978-1-60309-452-8	A Letter to Jo
978-1-60309-459-7	Lupus
978-1-60309-444-3	Red Panda and Moon Bear
978-1-60309-461-0	The Lab
Print all the key-value pairs in the following format

A Letter to Jo (ISBN: 978-1-60309-452-8)
Lupus (ISBN: 978-1-60309-459-7)
Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
The Lab (ISBN: 978-1-60309-461-0)
Remove the key-value pair with key 978-1-60309-444-3

Remove the key-value pair with value The Lab

Add the following key-value pairs to the map

Key	Value
978-1-60309-450-4	They Called Us Enemy
978-1-60309-453-5	Why Did We Trust Him?
Print whether there is an associated value with key 478-0-61159-424-8 or not

Print the value associated with key 978-1-60309-453-5
 */

import java.util.HashMap;

public class MapIntroductionTwo {
    public static void main(String[] args) {
//Create a map where the keys are strings and the values are strings with the following initial values
        HashMap<String, String> createdHashMap = new HashMap<>();
        System.out.println(createdHashMap);
//Add keys and values
        createdHashMap.put("978-1-60309-452-8", "A Letter to Jo");
        createdHashMap.put("978-1-60309-459-7", "Lupus");
        createdHashMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        createdHashMap.put("978-1-60309-461-0", "The Lab");

//Print all the key-value pairs in the following format
        for (String i : createdHashMap.keySet()) {
            for (String j : createdHashMap.values()) {
                System.out.println(j + "  " + "(ISBN:" + i + ")");
            }
        }
        //Remove the key-value pair with key 978-1-60309-444-3
        createdHashMap.remove("978-1-60309-444-3");
        System.out.println(createdHashMap);

        //Remove the key-value pair with value The Lab
        for (String k : createdHashMap.keySet()) {
            for (String v : createdHashMap.values()) {
                if (v == "The Lab") {
                    createdHashMap.remove(k, v);
                    System.out.println(createdHashMap);
                }
            }
        }
//Add the following key-value pairs to the map
        createdHashMap.put("978-1-60309-450-4", "They Called Us Enemy");
        createdHashMap.put("978-1-60309-453-5", "Why Did We Trust Him?");
        System.out.println(createdHashMap);

//Print whether there is an associated value with key 478-0-61159-424-8 or not
        String x = createdHashMap.get("478-0-61159-424-8");
        if (x == null) {
            System.out.println("there is NOT an associated value with key 478-0-61159-424-8");

        } else {
            System.out.println("there is an associated value with key 478-0-61159-424-8");
        }
        //Print the value associated with key 978-1-60309-453-5
        System.out.println(createdHashMap.get("978-1-60309-453-5"));
    }
}

