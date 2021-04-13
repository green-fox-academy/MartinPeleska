package com.company;

public class Main {
    public static void main(String[] args) {
        PostIt ideaOne = new PostIt("orange ", " Idea 1 ", " blue");
        PostIt awesome = new PostIt("pink ", " Awesome ", " black");
        PostIt superb = new PostIt("yellow ", " Superb ", " green");


        ideaOne.printPostIt();
        awesome.printPostIt();
        superb.printPostIt();
    }
}


