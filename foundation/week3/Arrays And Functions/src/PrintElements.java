public class PrintElements {
    // - Create an array variable named `numbers`
//   with the following content: `[4, 5, 6, 7]`
// - Print all the elements of `numbers`
    public static void main ( String[] args ) {

        int [] numbers = {4,5,6,7};

        for (int number:  numbers) {
            System.out.print (number+ " " );
        }

    }
}

//String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//for (String i : cars) {
//  System.out.println(i);
//}