
import java.util.HashMap;
import java.util.Map.Entry;

public class Test {
    public static void main(String[] args) {

        // create a hashmap
        HashMap<String, String> telephoneBook = new HashMap<>();
        telephoneBook.put("William A. Lathan", "405-709-1865");
        telephoneBook.put("John K. Miller", "402-247-8568");
        telephoneBook.put("Hortensia E. Foster", "606-481-6467");
        telephoneBook.put("Amanda D. Newland", "319-243-5613");
        telephoneBook.put("Brooke P. Askew", "307-687-2982");
        System.out.println("HashMap: " + telephoneBook);

        // value whose key is to be searched
        String value = "307-687-2982";

        // iterate each entry of hashmap
        for(Entry<String, String> entry: telephoneBook.entrySet()) {

            // if give value is equal to value from entry
            // print the corresponding key
            if(entry.getValue().equals( value)) {
                System.out.println("The key for value " + value + " is " + entry.getKey());
                break;
            }
        }
    }
}