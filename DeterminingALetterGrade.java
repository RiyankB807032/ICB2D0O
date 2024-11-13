import java.util.Scanner;
class DeterminingALetterGrade {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter your grades as a whole number (0-100)");
        int a = kb.nextInt();
        if (a < 0 && a > 100) {
        System.out.println("Invalid input. Please enter a number between 0 and 100.");
        } else if (a >= 50 && a <= 59) {
            System.out.println("Your grade is D");
        } else if (a >= 60 && a <= 69) {
            System.out.println("Your grade is C");
        } else if (a >= 70 && a <= 79) {
            System.out.println("Your grade is B");
        } else if (a >= 80) {
            System.out.println("Your grade is A");
        } else {
            System.out.println("Your grade is F");
        }
    }
}
