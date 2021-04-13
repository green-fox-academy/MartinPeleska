
/*
Create a PostIt class that has
a backgroundColor represented by a string
a text on it
a textColor represented by a string
Create a few example post-it objects:
an orange with blue text: "Idea 1"
a pink with black text: "Awesome"
a yellow with green text: "Superb!"
*/

package com.company;

public class PostIt {
    String backgroundColor;
    String textOnIt;
    String textColor;

    public PostIt(String backgroundColor, String textOnIt, String textColor) {
        this.backgroundColor = backgroundColor;
        this.textOnIt = textOnIt;
        this.textColor = textColor;

    }

    public void printPostIt() {
        System.out.println(backgroundColor + textColor + textOnIt);
    }
}



