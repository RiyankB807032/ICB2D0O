import java.util.Scanner;

class menu {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char choice = ' ';
        boolean valid = false;
        while (!valid) {
            System.out.print("Choose a, b, or c: ");
            choice = kb.next().charAt(0);
            valid = (choice == 'a' || choice == 'b' || choice == 'c');
        }
        System.out.printf("You chose: %c\n", choice);
        kb.close(); 
    }
}
