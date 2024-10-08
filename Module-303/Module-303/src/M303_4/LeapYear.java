package M303_4;

public class LeapYear {
    public static void main(String[] args) {
        int year = 1992;

        if ( (year % 4 == 0) && (year % 100 > 0) ) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
// || or
// && and

