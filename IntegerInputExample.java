import java.util.Scanner;

public class IntegerInputExample {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); //open for keyboard input
        System.out.print("Enter an integer: ");
        try {
            double a = kb.nextDouble();
            System.out.print("Enter another integer:");
            double b = kb.nextDouble();
            try{
            double c=a/b;
            if (c == Double.POSITIVE_INFINITY){
              throw new ArithmeticException();
            }
            System.out.print("Your answer is : " + c);
           } catch(ArithmeticException e){
            System.out.println("Invalid number");
            }
        } catch (Exception e) {
           System.out.println("Invalid input. Please enter a number");
        }
        kb.close();
    }
}
