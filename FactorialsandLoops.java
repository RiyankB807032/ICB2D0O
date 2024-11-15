// any import statements go here!
import java.util.Scanner;

public class FactorialsandLoops {
    public static void main(String[] args) {
        // Your code goes here!
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a positive number to find the factorial.");
        int n = kb.nextInt();
        int fac = 1;
        while (n >= 1) {
        fac = fac * n;
        n=n-1;
        }
System.out.println("Answer = " + fac);
        // Yout code stops here!
    }
}
