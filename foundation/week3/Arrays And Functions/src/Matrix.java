// - Create a two dimensional array dynamically with the following content.
//   Note that a two dimensional array is often called matrix if every
//   internal array has the same length.
//   Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
//   Its length should depend on a variable
//
// - Print this two dimensional array to the output

public class Matrix {
    public static void main (String[] args)
    {
        int[][] twoDimensionArray = new int[4][4];

        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                if (row==column) {
                    twoDimensionArray[row][column] = 1;
                } else {
                    twoDimensionArray[row][column] = 0;
                }
                System.out.print(twoDimensionArray[row][column]+ " ");
            }
            System.out.println();
        }
    }
}

