// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText applying indention

// Expected output:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo


public class TodoPrint {
    public static void main(String[] args){
        StringBuilder todoText= new StringBuilder ( " - Buy milk\n" );
        String  add1="My todo:\n",
                add2=" - Download games\n",
                add3="     - Diablo\n";
        System.out.println (todoText.insert(0,add1)+ add2.concat ( add3 ));
    }
}
