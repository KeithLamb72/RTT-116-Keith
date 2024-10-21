package Homework;

// DemoClass with a generic method
public class GLAB_303_11_1 {

    // create a generic method
    public <T> void genericsMethod(T data) {
        System.out.println("Generics Method:");
        System.out.println("Data Passed: " + data);
    }
}

// MyRunner class to demonstrate the generic method
class MyRunner {
    public static void main(String[] args) {
        // Initialize DemoClass and use the genericsMethod with different data types
        GLAB_303_11_1 dObj = new GLAB_303_11_1();
        dObj.genericsMethod(25);           // Passing Integer
        dObj.genericsMethod("Per Scholas"); // Passing String
        dObj.genericsMethod(2563.5);        // Passing Float
        dObj.genericsMethod('H');           // Passing Char

        // Initialize GMultipleDatatype class with String and Integer
        GMultipleDatatype<String, Integer> mobj = new GMultipleDatatype<>("Per Scholas", 11025);
        System.out.println(mobj.getValueOne());
        System.out.println(mobj.getValueTwo());

        // Initialize GMultipleDatatype class with String and String
        GMultipleDatatype<String, String> mobj2 = new GMultipleDatatype<>("Per Scholas", "Non profit");
        System.out.println(mobj2.getValueOne());
        System.out.println(mobj2.getValueTwo());
    }
}

// GMultipleDatatype class with two generic types
class GMultipleDatatype<Datatypeone, DatatypeTwo> {
    Datatypeone valueOne;
    DatatypeTwo valueTwo;

    // Constructor
    public GMultipleDatatype(Datatypeone v1, DatatypeTwo v2) {
        this.valueOne = v1;
        this.valueTwo = v2;
    }

    // Getter for valueOne
    public Datatypeone getValueOne() {
        return valueOne;
    }

    // Setter for valueOne
    public void setValueOne(Datatypeone valueOne) {
        this.valueOne = valueOne;
    }

    // Getter for valueTwo
    public DatatypeTwo getValueTwo() {
        return valueTwo;
    }

    // Setter for valueTwo
    public void setValueTwo(DatatypeTwo valueTwo) {
        this.valueTwo = valueTwo;
    }
}
