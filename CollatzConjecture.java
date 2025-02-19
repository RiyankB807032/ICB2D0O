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
    // current: Integer representing the current number in the Collatz sequence
    // highestValue: Integer to track the highest value reached in the sequence
    // numTerms: Integer to count the number of terms in the sequence
    */
    
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        String continueResponse = "y"; // Initialize with "y" to enter the loop

        do { // Start of the do-while loop
            int current = 0; // Initialize current variable
            boolean validInput = false; // Flag to check if the input is valid

            // Loop until a valid input is received
            while (!validInput) {
                System.out.print("Enter a whole number > 0: "); // Prompt user for input
                
                // Check if the input is an integer
                if (scanner.hasNextInt()) {
                    current = scanner.nextInt(); // Read the input number
                    if (current > 0) { // Ensure current is positive
                        validInput = true; // Set flag to true if input is valid
                    } else {
                        System.out.println("Please enter a positive whole number."); // Print error message
                    }
                } else {
                    System.out.println("Invalid input. Please enter a whole number."); // Print error message
                    scanner.next(); // Clear the invalid input
                }
            }

            // Initialize variables
            int highestValue = current; // Set the highest value to the initial input current
            int numTerms = 1; // Start counting terms with the first term

            // Print the starting number
            System.out.print("The Collatz sequence for " + current + " is: " + current); // Output the starting number

            // Generate Collatz sequence
            while (current != 1) { // Continue the loop until current becomes 1
                if (current % 2 == 0) { // Check if current is even
                    current = current / 2; // If even, divide current by 2
                } else { // If current is odd
                    current = 3 * current + 1; // Multiply current by 3 and add 1
                }

                // Print the next number in the sequence
                System.out.print("; " + current); // Output the current value of current in the sequence
                numTerms++; // Increment the term count by 1

                // Update the highest value reached
                if (current > highestValue) { // Check if the current is greater than highestValue
                    highestValue = current; // Update highestValue to the current
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
