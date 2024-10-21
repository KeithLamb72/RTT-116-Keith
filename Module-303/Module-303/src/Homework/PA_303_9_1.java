package Homework;

public class PA_303_9_1 {
}
/*
This assignment was all hacker ranks
Java Inheritance I.
Java Inheritance II.
Java Method Overriding.
Java Method Overriding 2 (Super Keyword).
 */
/*
!!!!!!**** JAVA INHERITANCE I ********!!!!!!!
import java.io.*;
import java.util.*;

class Animal {
    void walk() {
        System.out.println("I am walking");
    }
}

class Bird extends Animal {
    void fly(){
        System.out.println("I am flying");
    }
    void sing() {
        System.out.println("I am singing");
    }
}
public class Solution {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}

!!!!!***** JAVA INHERITANCE II *******!!!!!!!
import java.io.*;
import java.util.*;

class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {

}
public class Solution {

    public static void main(String[] args) {
       Adder adder = new Adder();
       System.out.println("My superclass is: Arithmetic");

       System.out.print("42 13 20");
    }
}
!!!!!!!!******* JAVA METHOD OVERRIDING *********!!!!!!!!!!
import java.io.*;
import java.util.*;

class Sports {
    String getName() {
        return "Generic Sports";
    }
    void getNumberOfPlayers(){
        System.out.println("Each team has n players in " + getName());
    }
}

class Soccer extends Sports {
    @Override
    String getName() {
        return "Soccer Class";
    }
    @Override
    void getNumberOfPlayers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}
public class Solution {

    public static void main(String[] args) {
        Sports aSport = new Sports();
        Soccer aSoccer = new Soccer();

        System.out.println(aSport.getName());
        aSport.getNumberOfPlayers();

        System.out.println(aSoccer.getName());
        aSoccer.getNumberOfPlayers();
    }
}

!!!!!!!!******* JAVA METHOD OVERRIDING 2 ******!!!!!!!!

import java.io.*;
import java.util.*;

class Vehicle {
    String describe() {
        return "I am a vehicle with pedals";
    }
}

class Cycle extends Vehicle {
    @Override
    String describe() {
        return "My ancestor is a cycle who is a vehicle with pedals.";
    }
}

class Motorcycle extends Cycle {
    @Override
    String describe() {
        return "Hello I am a motorcycle, I am a cycle with an engine.\n" + super.describe();
    }
}

public class Solution {
    public static void main(String[] args) {
        Motorcycle myMotorcycle = new Motorcycle();
        System.out.println(myMotorcycle.describe());
    }
}
 */
