// When saving this quote a disk error has occurred. Please fix it!
// Insert the words "always takes longer than" between the words "It" and "you" using the StringBuilder class!
// Use pieces of the quote variable (instead of just redefining the string)!

public class TakesLonger {
    public static void main(String... args) {
        StringBuilder quote = new StringBuilder("Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.");
        quote.insert(20," always takes longer than");//now original string is changed



        System.out.println(quote);

    }

 /*   class StringBuilderExample{
        public static void main(String args[]){
            StringBuilder sb=new StringBuilder("Hello ");
            sb.insert(1,"Java");//now original string is changed
            System.out.println(sb);//prints HJavaello
        }
    }
*/

}
