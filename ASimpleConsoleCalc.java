import java.util.Scanner;

public class ASimpleConsoleCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please input the first number: ");
        double num1 = scan.nextDouble();
        
        
        System.out.print("Please input the second number: ");
        double num2 = scan.nextDouble();
        
        
        System.out.print("Please input an operator (+, -, *, or /): ");
        char operator = scan.next().charAt(0);
        
        
        double result = 0.0;
        boolean validOperation = true; 
        
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                validOperation = false;
            }
        } else {
            System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
            validOperation = false;
        }
        
      
        if (validOperation) {
            System.out.printf("%.1f %c %.1f = %.1f%n", num1, operator, num2, result);
        }
        
        scan.close();
    }
}
