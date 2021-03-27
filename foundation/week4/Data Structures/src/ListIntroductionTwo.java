/*
Create a list ('List A') which contains the following values
Apple, Avocado, Blueberries, Durian, Lychee
Create a new list ('List B') with the values of List A
Print out whether List A contains Durian or not
Remove Durian from List B
Add Kiwifruit to List A after the 4th element
Compare the size of List A and List B
Get the index of Avocado from List A
Get the index of Durian from List B
Add Passion Fruit and Pomelo to List B in a single statement
Print out the 3rd element from List A
 */

import java.util.ArrayList;

public class ListIntroductionTwo {
    public static void main (String[] args) {
        ArrayList<String> listA = new ArrayList<String>();   // <-> ?????
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");
        System.out.println(listA);
    //Create a new list ('List B') with the values of List A
        ArrayList<String> listB = listA;
        System.out.println(listB);
        // Print out whether List A contains Durian or not
        if (listA.contains("Durian")) {
            System.out.println("List A contains Durian");
        }else System.out.println("List A doesn't contain Durian");{
        }
       // Remove Durian from List B
        listB.remove("Durian");
        System.out.println(listA);
        //Add Kiwifruit to List A after the 4th element
        listA.add("Kiwifruit");
        System.out.println(listA);
       // Compare the size of List A and List B
        if (listA == listB) {                                      //??? Je to ok? Nemelo by se to nerovnat?
            System.out.println("List A equals to List B");
        }else System.out.println("List A doesn't equals to List B");

        //Compare the size of List A and List B                   //??? Je to ok? Nemelo by se to nerovnat?
        if (listA.size() == listB.size()) {
            System.out.println("ListA size == listB size");
        }else {
            System.out.println("ListA size != listB size");
        }
        //Get the index of Avocado from List A
        System.out.println("Index of 'Avocado': "+listA.indexOf("Avocado"));

        //Get the index of Durian from List B
        System.out.println("Index of 'Durian': "+listB.indexOf("Durian"));  // -1  ???

        //Add Passion Fruit and Pomelo to List B in a single statement
        listB.add("Passion Fruit");
        listB.add("Pomelo");
        System.out.println(listB);

        //Print out the 3rd element from List A
        System.out.println(listA.get(2));



    }
}
