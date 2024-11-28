import java.util.Scanner; // Import the Scanner class for reading user input

public class CollatzConjecture {
    /*
Riyank Berde 807032
Date: 11/27/2024
Course: Grade 10 Comp Sci
Title: Collatz Conjecture 
Description: A program which outputs a series of numbers based on an algorithm.
VARIABLE DICTIONARY: 
// scanner: Scanner object for reading user input
// continueResponse: String to determine if the user wants to run the program again
// n: Integer representing the current number in the Collatz sequence
// highestValue: Integer to track the highest value reached in the sequence
// numTerms: Integer to count the number of terms in the sequence
*/
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        String continueResponse = "y"; // Initialize with "y" to enter the loop

        do { // Start of the do-while loop
            System.out.print("Enter a whole number > 0: "); // Prompt user for input
            int n = scanner.nextInt(); // Read the input number and store it in variable n

            // Ensure n is positive
            if (n <= 0) { // Check if n is less than or equal to 0
                System.out.println("Please enter a positive whole number."); // Print error message
                continue; // Skip to the next iteration of the loop
            }

            // Initialize variables
            int highestValue = n; // Set the highest value to the initial input n
            int numTerms = 1; // Start counting terms with the first term

            // Print the starting number
            System.out.print("The Collatz sequence for " + n + " is: " + n); // Output the starting number

            // Generate Collatz sequence
            while (n != 1) { // Continue the loop until n becomes 1
                if (n % 2 == 0) { // Check if n is even
                    n = n / 2; // If even, divide n by 2
                } else { // If n is odd
                    n = 3 * n + 1; // Multiply n by 3 and add 1
                }

                // Print the next number in the sequence
                System.out.print(";" + n); // Output the current value of n in the sequence
                numTerms++; // Increment the term count by 1

                // Update the highest value reached
                if (n > highestValue) { // Check if the current n is greater than highestValue
                    highestValue = n; // Update highestValue to the current n
                }
            }

            // Output results
            System.out.println(); // Print a new line for better formatting
            System.out.println("Number of terms = " + numTerms); // Display the total number of terms in the sequence
            System.out.printf("Highest value reached = %,d%n", highestValue); // Display the highest value reached 

            System.out.print("Do another? (y/n) "); // Ask user if they want to continue
            continueResponse = scanner.next(); // Read the user's response and store it in continueResponse
        } while (continueResponse.equalsIgnoreCase("y")); // Loop continues if user inputs 'y' or 'Y'

        System.out.println("Goodbye!"); // Print a goodbye message when the loop ends
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
