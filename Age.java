import java.util.Scanner;
public class Main {
public static void main(String[] args) {
        // Your code goes here!
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your year of birth: ");
        int birthYear = scanner.nextInt();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        int result = birthYear * 2;
        result += 5;
        result *= 50;
        result += age;
        result -= 250;
        double finalResult = result / 100.0;
        System.out.println("The result of the calculation is: " + finalResult);
        System.out.println("This result is the combination of your birth year and age after performing the operations.");
