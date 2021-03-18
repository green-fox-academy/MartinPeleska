public class ConditionalVariableMutation {
    public static void main(String[] args) {
        double a = 24;
        int output1 = 0;
        // if a is even increment out by one

        if (a % 2 == 0) {
            System.out.println(output1 + 1);
        }


        int b = 1;
        String output2 = "";
        // if b is between 10 and 20 set out2 to "Sweet!"
        // if less than 10 set out2 to "Less!",
        // if more than 20 set out2 to "More!"

        if (b >= 10 && b <= 20) {
            output2 = "Sweet";
            System.out.println(output2);
        } else if (b < 10) {
            output2 = "Less!";
            System.out.println(output2);
        } else if (b > 20) {
            output2 = "More!";
            System.out.println(output2);
        }
    }
}




