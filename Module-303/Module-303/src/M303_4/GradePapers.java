package M303_4;

public class GradePapers {
    public static void main(String[] args) {

        // grades
        int grade = 60;
        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        //case statement // switch statement example
        switch (grade) {
            case 45:
                System.out.println("You got a 90");
                break;
            case 40:
                System.out.println("You got a 80");
                break;

            default: {
                //this is the else if no other conditions are meet
            }
        }
        System.out.println(grade);
    }
}