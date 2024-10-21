package Homework;

// Define the interface LibraryUser
interface LibraryUser {
    void registerAccount();
    void requestBook();
}

// Implementing KidUser class that implements the LibraryUser interface
class KidUser implements LibraryUser {
    int age;
    String bookType;

    // Constructor to initialize KidUser
    public KidUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age <= 11) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, age must be less than 12 to register as a kid.");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equals("Kids")) {
            System.out.println("Book issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books.");
        }
    }
}

// Implementing AdultUser class that implements the LibraryUser interface
class AdultUser implements LibraryUser {
    int age;
    String bookType;

    // Constructor to initialize AdultUser
    public AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age >= 12) {
            System.out.println("You have successfully registered under an Adult Account.");
        } else {
            System.out.println("Sorry, age must be greater than 12 to register as an adult.");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equals("Fiction")) {
            System.out.println("Book issued successfully, please return the book within 7 days.");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books.");
        }
    }
}

// Main class to test the interface and its implementations
public class PA_303_10_3 {
    public static void main(String[] args) {
        // Test case #1: KidUser
        KidUser kidUser1 = new KidUser(10, "Kids");
        kidUser1.registerAccount();
        kidUser1.requestBook();

        KidUser kidUser2 = new KidUser(18, "Fiction");
        kidUser2.registerAccount();
        kidUser2.requestBook();

        // Test case #2: AdultUser
        AdultUser adultUser1 = new AdultUser(5, "Kids");
        adultUser1.registerAccount();
        adultUser1.requestBook();

        AdultUser adultUser2 = new AdultUser(23, "Fiction");
        adultUser2.registerAccount();
        adultUser2.requestBook();
    }
}
