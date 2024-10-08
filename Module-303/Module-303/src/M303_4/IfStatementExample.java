package M303_4;

public class IfStatementExample {
    public static void main(String[] args) {

        double radius = 30;

        if (radius > 10) {
            System.out.println("The radius is greater than 10");
        } else if (radius > 20) {
            System.out.println("The radius is greater than 20");
        } else {
            System.out.println("The radius is less than 10");
        }

        System.out.println("Done");

        // -- Boolean

        // if the boolean is set to true .. if not specified if statement will always be checking if true
        boolean save = true;
        if (save) {
            // the same as saying if ( save == true ) {
            //this will execute when the boolean is true
        }
        if (!save) {
            //the same as saying if { save == false ) {
        }

        //Compound conditionals
        // short ciruiting means... in this case if save is false the JVM will not even evaluate the radius
        if (save && (radius == 50)) {
            // Both Conditions are true
        } else {
            //one condition are true
        }

        //this to will short ciruit
        if (save || (radius == 50)) {
            //if either conditions (or both) are true then execute here
        } else {
        }
    }
}

// Check this out on debugger to see how if statment works


