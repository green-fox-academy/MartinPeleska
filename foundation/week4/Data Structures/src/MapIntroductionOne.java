/*
We are going to play with maps. Feel free to use the built-in methods where possible.

Create an empty map where the keys are integers and the values are characters

Print out whether the map is empty or not

Add the following key-value pairs to the map

Key	Value
97	a
98	b
99	c
65	A
66	B
67	C
Print all the keys

Print all the values

Add value D with the key 68

Print how many key-value pairs are in the map

Print the value that is associated with key 99

Remove the key-value pair where with key 97

Print whether there is an associated value with key 100 or not

Remove all the key-value pairs
 */

// Import the HashMap class
import java.util.HashMap;
public class MapIntroductionOne {
    public static void main (String[] args ) {
// Create a HashMap object called capitalCities
        HashMap<Integer, String> numbersAndCharacters = new HashMap<>();
        System.out.println(numbersAndCharacters);

// Add keys and values (Key, Value)
        numbersAndCharacters.put(97, "a");
        numbersAndCharacters.put(98, "b");
        numbersAndCharacters.put(99, "c");
        numbersAndCharacters.put(65, "A");
        numbersAndCharacters.put(66, "B");
        numbersAndCharacters.put(67, "C");

        System.out.println(numbersAndCharacters);
        //Print all the keys
        System.out.println(numbersAndCharacters.keySet());
        //Print all the values
        System.out.println(numbersAndCharacters.values());

        //Add value D with the key 68
        numbersAndCharacters.put(68, "D");
        System.out.println(numbersAndCharacters);

        //Print how many key-value pairs are in the map
        System.out.println(numbersAndCharacters.size());

        //Print the value that is associated with key 99
        System.out.println(numbersAndCharacters.get(99));

        //Remove the key-value pair where with key 97
        numbersAndCharacters.remove(97);
        System.out.println(numbersAndCharacters);

        //Print whether there is an associated value with key 100 or not
        System.out.println(numbersAndCharacters.get(100));

        //Remove all the key-value pairs
        numbersAndCharacters.clear();
        System.out.println(numbersAndCharacters);

    }
}
