// any import statements go here!
import java.util.Scanner;

public class ThreeOptioncondition {
    public static void main(String[] args) {
        // Your code goes here!
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the probability of precipitation (as a decimal fraction, e.g., 0.15 for 15%): ");
        double probability = scanner.nextDouble();
        if (probability < 0.07) {
            System.out.println("The forecast is dry weather.");
        } else if (probability > 0.60) {
            System.out.println("The forecast is rain.");
        } else {
            System.out.println("The forecast is a small chance of rain.");
        }
        // Yout code stops here!
    }
}
