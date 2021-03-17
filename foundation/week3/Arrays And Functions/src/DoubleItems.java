// - Create an array variable named `numberList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array

public class DoubleItems {
    public static void main(String[] args) {
        int[] numberlist = {3, 4, 5, 6, 7};
        for (int number : numberlist) {                               // ??? Co dela tato radka ???

            System.out.println(number * 2);

        }
    }
}



//for (int i = 0; i <= 10; i = i + 2) {
//        System.out.println(i);
//        }


//String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//cars[0] = "Opel";
//System.out.println(cars[0]);
//// Now outputs Opel instead of Volvo