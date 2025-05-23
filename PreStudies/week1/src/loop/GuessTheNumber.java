package loop;

import java.util.Scanner;

/*
    TODO:Create a random number from 1 to 100, which the user must guess.
    For every number entered, the program outputs whether the number is less than, greater or equal to the random number.
    This way the user approaches the result step by step.
    Hint: Random numbers can be created in various ways - e.g. Math.random()
 */

public class GuessTheNumber {
    public static void main(String[] args) {

        int target = (int)(Math.random() * 100) + 1; // Random number between 1 and 100
        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        System.out.println("Guess a number between 1 and 100:");

        while (guess != target) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < target) {
                System.out.println("Too low! Try a higher number.");
            } else if (guess > target) {
                System.out.println("Too high! Try a lower number.");
            } else {
                System.out.println(" Correct! The number was " + target + ".");
                break;
            }
        }
    }
}

