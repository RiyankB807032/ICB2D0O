// any import statements go here!
import java.util.Scanner;

public class GuessingGame {
public static void main(String[] args) {
// Your code goes here!
Scanner kb = new Scanner(System.in);
int correctNumber = 7;
int guess = 0;
boolean guessedCorrectly = false;
int maxGuesses = 5; 
int attempts = 0; 

while (!guessedCorrectly && attempts < maxGuesses) {
System.out.print("Guess a number between 1 and 10: ");
guess = kb.nextInt();
attempts++; 

if (guess == correctNumber) {
  System.out.println("Right answer!");
      guessedCorrectly = true; 
            } else {
                System.out.println("Incorrect");
            }
        }
        if (!guessedCorrectly) {
            System.out.println("Sorry, you've used all your guesses. The correct number was " + correctNumber + ".");
        }
    }
}
