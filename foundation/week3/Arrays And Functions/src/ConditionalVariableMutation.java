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

        int c = 123;
        int credits = 100;
        boolean isBonus = false;
        // if credits are at least 50,
        // and isBonus is false decrement c by 2

        if (credits >= 50 && isBonus == false) {
            System.out.println(c + 2);
        } else if (credits < 50 && isBonus == false) {
            System.out.println(c - 1);
        }
            // if credits are smaller than 50,
            // and isBonus is false decrement c by 1

        if (isBonus == true) {

            System.out.println(c);
            // if isBonus is true c should remain the same
        }




        int d = 8;
        int time = 120;
        String output3 = "";
        // if d is dividable by 4
        // and time is not more than 200
        // set out3 to "check"
        if (d % 4 == 0 && time <= 200) {
            output3 = "check";
            System.out.println(output3);
        } else if (time > 200) {
            output3 = "Time out";
            System.out.println(output3);
        }

    }
}




