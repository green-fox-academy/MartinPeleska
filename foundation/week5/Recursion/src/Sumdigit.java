public class Sumdigit {

    public static void main(String[] args) {
        System.out.println(addNumber(3));
    }

    private static int addNumber(int number) {
        if (number == 0) {
            return 0;
        } else {
            int totalNum = number + addNumber(number - 1);
            return totalNum;
        }
    }
}
