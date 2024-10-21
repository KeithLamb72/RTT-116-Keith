package Homework;

public class GLAB_303_10_1 {
    static class Person {
        String name;
        static int lifeSpan = 60;
        static double ageFactor = 1.0;

        public Person() {
            name = "";
        }

        public Person(String aName) {
            name = aName;
        }

        public String getName() {
            return name;
        }

        public void setName(String aName) {
            name = aName;
        }

        public String toString() {
            return ("Hello, my name is " + name);
        }

        public String talk() {
            return ("I have nothing to say.");
        }

        public String walk() {
            return ("I have nowhere to go.");
        }

        public static double lifeSpan() {
            return (lifeSpan * ageFactor);
        }
    }

    static class Boy extends Person {
        static double ageFactor = 1.1;

        @Override
        public String talk() {
            return (super.talk() + " ... but I love Java class.");
        }

        @Override
        public String walk() {
            return ("I am now walking");
        }
    }

    static class Girl extends Person {
        static double ageFactor = 1.3;

        public Girl(String aName) {
            super("Ms." + aName);
        }

        @Override
        public String talk() {
            return ("Hello! " + jump());
        }

        public String jump() {
            return ("I am jumping.");
        }

        public static double lifeSpan() {
            return (Person.lifeSpan * ageFactor);
        }
    }

    public static void main(String args[]) {
        Person aPerson;
        Boy jimmy;
        Girl betty;

        aPerson = new Person("Fred");
        jimmy = new Boy();
        betty = new Girl("Betty");

        System.out.println(aPerson);
        System.out.println(aPerson.talk());
        System.out.println(aPerson.walk());
        System.out.println();

        System.out.println(jimmy);
        System.out.println(jimmy.talk());
        System.out.println(jimmy.walk());
        System.out.println();

        System.out.println(betty);
        System.out.println(betty.talk());
        System.out.println(betty.walk());
        System.out.println();

        System.out.println((Person) jimmy);
        System.out.println(((Person) jimmy).talk());
        System.out.println(((Person) jimmy).walk());
        System.out.println();

        System.out.println((Person) betty);
        System.out.println(((Person) betty).talk());
        System.out.println(((Person) betty).walk());
        System.out.println();

        System.out.println(Person.lifeSpan());
        System.out.println(Boy.lifeSpan());
        System.out.println(Girl.lifeSpan());

        // Uncomment below to simulate the exception
        // System.out.println(((Boy)aPerson).talk()); // This will cause ClassCastException
    }
}

