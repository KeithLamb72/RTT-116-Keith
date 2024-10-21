package Homework;

/**
 * Class demonstrates encapsulation in Java.
 * It contains the HumanBeing class that encapsulates properties of a human being
 * and shows how to set and retrieve these properties using setters and getters.
 */
public class GLAB_303_9_1 {

    /**
     * The HumanBeing class encapsulates properties of a human being including weight, height, and BMI.
     * It provides constructor overloading to initialize these properties and public setter and getter methods
     * to manipulate and access these properties safely from other classes.
     */
    static class HumanBeing {
        private float weight;
        private float height;
        private float bmi;

        // Constructor with all parameters to initialize the class variables
        public HumanBeing(float weight, float height, float bmi) {
            this.weight = weight;
            this.height = height;
            this.bmi = bmi;
        }

        // Default constructor in case no initial values are provided
        public HumanBeing() {
        }

        // Getter method for weight
        public float getWeight() {
            return weight;
        }

        // Setter method for weight
        public void setWeight(float weight) {
            this.weight = weight;
        }

        // Getter method for height
        public float getHeight() {
            return height;
        }

        // Setter method for height
        public void setHeight(float height) {
            this.height = height;
        }

        // Getter method for bmi
        public float getBmi() {
            return bmi;
        }

        // Setter method for bmi
        public void setBmi(float bmi) {
            this.bmi = bmi;
        }
    }

    /**
     * Main method demonstrates the usage of the HumanBeing class.
     * It creates an instance of HumanBeing, sets its attributes using setter methods,
     * calculates the BMI, and prints out the attributes using getter methods.
     */
    public static void main(String[] args) {
        // Creating an instance of HumanBeing using the default constructor
        HumanBeing h1 = new HumanBeing();

        // Setting properties using the public setter methods
        h1.setHeight(1.65f);
        h1.setWeight(68);
        h1.setBmi(calculateBmi(h1));

        // Printing the details of the human being using the public getter methods
        System.out.println("Person has " + h1.getWeight() + " kgs and is " + h1.getHeight() +
                " meters in height, which results in BMI of " + h1.getBmi());
    }

    public static float calculateBmi(HumanBeing h1) {
        return h1.getWeight() / (h1.getHeight() * h1.getHeight());
    }
}
