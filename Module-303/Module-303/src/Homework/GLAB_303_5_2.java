package Homework;

import java.util.Scanner;

public class GLAB_303_5_2 {
    public static void main(String[] args) {
        guessTheNumber();
        subtractionQuizLoop();
        sentinelValueDemo();
    }

    /*
    1. Write a program that randomly generates an integer between 0 and 100.
       The program should prompt the user to guess the number repeatedly
       until the guessed number matches the randomly generated number.
       If the guess is too low or too high, inform the user.
       Once the correct guess is made, display a congratulatory message.
    */
    public static void guessTheNumber() {
        // Generate a random number to be guessed
        int number = (int) (Math.random() * 101);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        int guess = -1; // Initial guess value
        // While the guessed number is not equal to the randomly generated number
        while (guess != number) {
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt(); // Read user input

            // Compare guessed number with the random number
            if (guess == number) {
                System.out.println("Yes, the number is " + number); // Correct guess
            } else if (guess > number) {
                System.out.println("Your guess is too high"); // Guess is too high
            } else {
                System.out.println("Your guess is too low"); // Guess is too low
            }
        }
    }

    /*
    2. Write a program that generates five single-digit integer subtraction problems.
       Using a while loop, prompt the user to answer all five problems.
       After all answers are entered, report the number of correct answers.
    */
    public static void subtractionQuizLoop() {
        final int NUMBER_OF_QUESTIONS = 5; // Number of questions to ask
        int correctCount = 0; // Track the number of correct answers
        int count = 0; // Track the number of asked questions
        Scanner input = new Scanner(System.in);

        // While the count is less than the number of questions
        while (count < NUMBER_OF_QUESTIONS) {
            // Generate two random single-digit integers
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            // Swap number1 and number2 if number1 < number2
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            // Prompt the user for the answer
            System.out.print("What is " + number1 + " - " + number2 + "? ");
            int answer = input.nextInt();

            // Check if the answer is correct
            if (number1 - number2 == answer) {
                System.out.println("You are correct!");
                correctCount++; // Increment the correct answer count
            } else {
                System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + " should be " + (number1 - number2));
            }

            count++; // Increment the question count
        }

        // Display the number of correct answers
        System.out.println("You got " + correctCount + " correct answers.");
    }

    /*
    3. Write a program that reads and calculates the sum of an unspecified number of integers.
       The input 0 signifies the end of input. If the input is not 0, it is added to the sum.
    */
    public static void sentinelValueDemo() {
        Scanner input = new Scanner(System.in);

        // Prompt the user for an integer value (program ends if the input is 0)
        System.out.print("Enter an int value (the program exits if the input is 0): ");
        int data = input.nextInt();
        int sum = 0; // Initialize sum

        // While data is not equal to 0, keep adding to the sum
        while (data != 0) {
            sum += data; // Add the current input to the sum

            // Prompt for the next integer input
            System.out.print("Enter an int value (the program exits if the input is 0): ");
            data = input.nextInt(); // Read the next input
        }

        // Once the loop ends, display the total sum
        System.out.println("The sum is " + sum);
    }
}
