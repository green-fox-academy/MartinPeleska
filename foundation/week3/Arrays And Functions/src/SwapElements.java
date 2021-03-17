// - Create an array variable named `orders`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `orders`

public class SwapElements {
    public static void main (String[] args ){
        String[] orders = { "first", "second", "third" }; {
            String x = orders[2];
            orders[2] = orders[0];
            orders[0] = x;

            System.out.println(orders[0]);
            System.out.println(orders[1]);
            System.out.println(orders[2]);

        }
    }
}
/*    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
cars[0] = "Opel";
        System.out.println(cars[0]);
// Now outputs Opel instead of Volvo

 */