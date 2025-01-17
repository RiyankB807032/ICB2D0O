package javaapplication3;
        
import java.io.File; // Import File class for file handling
import java.util.Scanner; // Import Scanner for reading input
/**
 *
 * Riyank Berde 807032
   Date: 1/17/2025
   Course: Grade 10 Comp Sci
   Title: Final Assessment: Credit River Credit Cards
   Description: A program which reads a file of credit card balances and calculates the final and average.
   // Variable Dictionary:
        // fileName: The path to the input file containing credit card transactions.
        // totalBalance: The cumulative total of all final balances calculated.
        // highestBalance: The highest final balance found among all customers.
        // lowestBalance: The lowest final balance found among all customers.
        // highestAccount: The account number associated with the highest balance.
        // lowestAccount: The account number associated with the lowest balance.
        // customerCount: The total number of customers processed.
 */

public class JavaApplication3 {

    // Method to calculate the final balance after a purchase and payment
    static double calculateFinalBalance(double oldBal, double purchase, double payment) {
        return oldBal + purchase - payment; // Calculate and return the final balance
    }

    public static void main(String[] args) {
        String fileName = "C:\\Users\\807032\\OneDrive - Peel District School Board\\Documents\\NetBeansProjects\\JavaApplication3\\src\\javaapplication3\\ledger.dat";// 
        // Define the name of the input file
        double totalBalance = 0; // Total of all final balances
        double highestBalance = 0; // Initialize highest balance
        double lowestBalance = Double.MAX_VALUE; // Initialize lowest balance
        String highestAccount = ""; // Variable for highest account number
        String lowestAccount = ""; // Variable for lowest account number
        int customerCount = 0; // Counter for the number of customers

        // Read data from the file
        try {
            Scanner scanner = new Scanner(new File(fileName)); // Create a Scanner to read the file

            // Read lines until the end of the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine(); // Read the next line from the file

                // Create a new Scanner to parse the line
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter("\\s+"); // Use whitespace as the delimiter

                // Read the values directly
                String accountNumber = lineScanner.next(); // Get the account number
                double startingBalance = lineScanner.nextDouble(); // Parse starting balance
                double recentPurchase = lineScanner.nextDouble(); // Parse recent purchase
                double recentPayment = lineScanner.nextDouble(); // Parse recent payment

                // Calculate final balance using the function
                double finalBalance = calculateFinalBalance(startingBalance, recentPurchase, recentPayment);
                customerCount++; // Increment the customer count

                // Print the account number and final balance for each customer
                System.out.printf("Account: %s, Final Balance: %.2f%n", accountNumber, finalBalance);
                totalBalance += finalBalance; // Add final balance to total balance

                // Check for the highest balance
                if (finalBalance > highestBalance) {
                    highestBalance = finalBalance; // Update highest balance
                    highestAccount = accountNumber; // Update account number for highest balance
                }
                // Check for the lowest balance
                if (finalBalance < lowestBalance) {
                    lowestBalance = finalBalance; // Update lowest balance
                    lowestAccount = accountNumber; // Update account number for lowest balance
                }

                lineScanner.close(); // Close the line scanner
            }
            scanner.close(); // Close the main scanner
        } catch (Exception e) { // Catch any exceptions
            System.out.println("Error: " + e.getMessage()); // Print error message
        }

        // Calculate the average balance
        double averageBalance = customerCount > 0 ? totalBalance / customerCount : 0; // Average balance calculation

        // Print the highest balance and corresponding account number if valid balances exist
        if (customerCount > 0) {
            System.out.printf("Highest Balance: %s, Amount: %.2f%n", highestAccount, highestBalance);
            System.out.printf("Lowest Balance: %s, Amount: %.2f%n", lowestAccount, lowestBalance);
        } else {
            System.out.println("No valid balances found.");
        }

        // Print the average balance
        System.out.printf("Average Balance: %.2f%n", averageBalance);
    }
}


