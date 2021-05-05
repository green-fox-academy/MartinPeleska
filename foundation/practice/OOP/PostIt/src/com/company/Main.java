package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PostIt post1 = new PostIt("orange",  "Ideal", "blue");
        PostIt post2 = new PostIt("pink",  "Awesome", "back");
        PostIt post3 = new PostIt("yellow",  "Superb", "green");

        post1.printPostIt();
        post2.printPostIt();
        post3.printPostIt();
    }
}
