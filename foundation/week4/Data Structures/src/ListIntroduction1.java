
/*We are going to play with lists. Feel free to use the built-in methods where possible.

        Create an empty list which will contain names (strings)
        Print out the number of elements in the list
        Add William to the list
        Print out whether the list is empty or not
        Add John to the list
        Add Amanda to the list
        Print out the number of elements in the list
        Print out the 3rd element
        Iterate through the list and print out each name
        William
        John
        Amanda
        Iterate through the list and print
        1. William
        2. John
        3. Amanda
        Remove the 2nd element
        Iterate through the list in a reversed order and print out each name
        Amanda
        William
        Remove all elements

 */

import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.size());
        list.add("William");
        System.out.println("The ArrayList is empty - true/false:   " + list.isEmpty());
        list.add("John");
        list.add("Amanda");
        System.out.println(list.size());
        System.out.println(list);

        int i = 0;
        for (i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        int j = 0;
        for (j = 0; j < list.size(); j++) {
            System.out.println(j + 1 + ". " + list.get(j));
        }
        list.remove(1);
        System.out.println(list);

        for (i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
        list.clear();
        System.out.println(list.size());
    }
}
