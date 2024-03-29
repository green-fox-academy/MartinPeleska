package com.company;

import java.util.Collection;

public class Counter {

    int initialValue;
    int counter;

    public Counter(int initialValue) {
        this.initialValue = initialValue;
        counter = initialValue;
    }

    public Counter() {
        initialValue = 0;
        counter = initialValue;

    }

    public int get() {
        return counter;
    }

    public void reset() {
        this.counter = initialValue;
    }

    public void add(int number) {
        counter = number;
    }

    public void add() {
        counter++;
    }
}



/*
Create Counter class
which has a counter (integer) field
at creation it should have a default value 0 or can be specified by a parameter
we can add another whole number to this counter: add(number)
we can just increase the counter's value by one: add() (no parameters)
we can get() the current counter value
and we can reset() the counter to the initial value
Check if everything works fine with the proper tests:
Download CounterTest.java and place it next to your solution
If you are unsure about how to get this running, you can watch a video tutorial
Other hints for running:
If something gets red:
Windows, Linux:
press ALT+Enter and add JUnit5 to classpath (5 aka JUnit FIVE not 4 or 3)
OSX:
press ⌥⏎ and add JUnit5 to classpath (5 aka JUnit FIVE not 4 or 3)
Run the tests one by one with the green play button before the method name (or run all of by pressing the button before the classname)
 */