
public class NumberAdder {

    public static void main(String[] args) {
        System.out.println(addNum(3));
    }

    private static int addNum(int number) {
        if (number == 0) {
            return 0;
        } else {
            int totalNum = number + addNum(number - 1);
            return totalNum;
        }
    }
}


