package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PostIt2 post1 = new PostIt2("orange", "blue", "Ideal" );
        PostIt2 post2 = new PostIt2("pink", "black", "Awesome" );
        PostIt2 post3 = new PostIt2("yellow", "green", "Superb" );

        post1.printPostIt();
        post2.printPostIt();
        post3.printPostIt();


    }
}
