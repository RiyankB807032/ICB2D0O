import java.util.Scanner;

public class Rock-Paper-Scissors {
    /*
    Riyank Berde 807032
    Date: 11/27/2024
    Course: Grade 10 Comp Sci
    Title: Rock-Paper-Scissors Game
    Description: A program that allows a user to play Rock-Paper-Scissors against the computer.
    VARIABLE DICTIONARY:
    // scanner: Scanner object for reading user input
    // playerWins: Integer to keep track of the number of games won by the player
    // computerWins: Integer to keep track of the number of games won by the computer
    // ties: Integer to keep track of the number of ties in the games
    // numberOfGames: Integer to store the number of games the user wants to play
    // playerChoice: Character storing the player's choice (rock, paper, or scissors)
    // computerNum: Integer representing the randomly generated number for computer's choice
    // computerChoice: Character storing the computer's choice (rock, paper, or scissors)
    // i: Integer used as a loop counter
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerWins = 0; // variable to keep track of player wins
        int computerWins = 0; // variable to keep track of computer wins
        int ties = 0; // variable to keep track of ties

        // Ask the user for the number of games
        System.out.print("How many games of Rock-Paper-Scissors would you like to play? "); // Prompt user for input
        int numberOfGames = scanner.nextInt(); // Read the number of games from user input
        scanner.nextLine(); // Consume the newline character left by nextInt()

        // Loop for the number of games specified by the user
        for (int i = 0; i < numberOfGames; i++) {
            // Computer chooses randomly
            int computerNum = (int) (3 * Math.random()) + 1; // Generate a random number between 1 and 3
            char computerChoice; // Variable to store computer's choice
            if (computerNum == 1) { // If random number is 1
                computerChoice = 'r'; // Computer chooses rock
            } else if (computerNum == 2) { // If random number is 2
                computerChoice = 'p'; // Computer chooses paper
            } else { // If random number is 3
                computerChoice = 's'; // Computer chooses scissors
            }

            // Prompt user to enter their choice
            System.out.print("Enter your choice (r = rock, p = paper, s = scissors): "); // Ask user for their choice
            char playerChoice = scanner.nextLine().toLowerCase().charAt(0); // Read user's choice and convert to lowercase

            // Display what the computer chose
            System.out.println("The computer chose: " + computerChoice);

            // Determine winner
            if (playerChoice == computerChoice) { // If player's choice matches computer's choice
                System.out.println("It's a tie!"); // Print tie message
                ties++; // Increment tie count
            } else if ((playerChoice == 'r' && computerChoice == 's') || // Player wins with rock against scissors
                      (playerChoice == 'p' && computerChoice == 'r') || // Player wins with paper against rock
                      (playerChoice == 's' && computerChoice == 'p')) { // Player wins with scissors against paper
                System.out.println("You win!"); // Print win message
                playerWins++; // Increment player win count
            } else { // If none of the above
                System.out.println("Computer wins!"); // Print computer win message
                computerWins++; // Increment computer win count
            }
        }
        
        // Final score
        System.out.println("Final results: "); // Print final results message
        System.out.println("Player wins: " + playerWins); // Display player win count
        System.out.println("Computer wins: " + computerWins); // Display computer win count
        System.out.println("Ties: " + ties); // Display tie count
        if (computerWins > playerWins) // If the computer's score is higher than the players score
          System.out.println("The computer wins!"); // Print the computers win
        else if (playerWins > computerWins) // If the players score is higher than the computer's score
          System.out.println("The player wins!"); // Print the players win
        else // If neither of these things happened
          System.out.println("You tied, nobody wins."); // Print this as it has to be a tie
        scanner.close(); // closes the scanner
    } 
}


