package com.company;
public class compare_lengths {



    public static void main (String[]args){
        // - Create an array variable named `firstArrayOfNumbers`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `secondArrayOfNumbers`
//   with the following content: `[4, 5]`
// - Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers` has more
//   elements than `firstArrayOfNumbers`
// - Otherwise print: "firstArrayOfNumbers is the longer one"



        int [] firstArrayOfNumbers={1,2,3};
        int [] secondArrayOfNumbers={4,5};


        if (firstArrayOfNumbers.length > secondArrayOfNumbers.length){
            System.out.println ("First Array is longer");
        }else{
            System.out.println ("Second array is longer");


    }
}
}
