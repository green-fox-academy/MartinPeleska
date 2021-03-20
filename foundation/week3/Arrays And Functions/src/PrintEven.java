public class PrintEven {
    public static void main(String[] args) {
        int a = 0;
        while (a < 500) {
            if (a % 2 == 0) {
                System.out.println(a); // Prints the numbers from 0 to 9
            }
            a += 1;
        }
    }
}
