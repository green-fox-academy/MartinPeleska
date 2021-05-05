package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Sharpie sharpie1 = new Sharpie("green", 5, 50);

        sharpie1.use();
    }
}

/*
Create a Sharpie class
We should know the followings about each sharpie:
color (which should be a string),
width (which will be a floating point number) and the
inkAmount (another floating point number)
We need to specify the color and the width at creation
Every sharpie is created with a default inkAmount value: 100
We can use() the sharpie objects: using it decreases inkAmount by 10
 */