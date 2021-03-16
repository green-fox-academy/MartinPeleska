// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText applying indention

// Expected output:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo
/*

public class TodoPrint {
    public static void main(String[] args){
        StringBuilder todoText= new StringBuilder ( " - Buy milk\n" );
        String  add1="My todo:\n",
                add2=" - Download games\n",
                add3=" - Diablo\n";
        System.out.println (todoText.insert(0,add1)+ add2.concat ( add3 ));
    }
}
*/
public class TodoPrint {
    public static void main(String[] args){
        StringBuilder todoList= new StringBuilder ( " - Buy milk\n" );

        todoList.append(" - Download games\n");
        todoList.append(" - Diablo\n");

        System.out.println(todoList);

    }
}



/*
class AddNewLineDemo{
  public static void main(String args[]){

     // Create StringBuilder object
     StringBuilder sb = new StringBuilder("String1 - ");

     // Appending a String to StringBuilder
     sb.append("String2 - ");

     // Method 1: Add new Line using append() method
     sb.append("\n");

     // Again Appending a new String
     sb.append("String3 - ");

     // Method 2: Add new Line using System.getProperty()
     sb.append(System.getProperty("line.separator"));

     //Adding few more Strings
     sb.append("String4 - ");
     sb.append("String5 - ");

     // Displaying the output
     System.out.println(sb);
  }
}
Output:

String1 - String2 -
String3 -
String4 - String5 -
 */