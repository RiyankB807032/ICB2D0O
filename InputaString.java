import java.util.Scanner;

class InputaString {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    String greeting = new String();

    System.out.print("Hi. Please enter a greeting in one word: ");
    greeting = kbd.next();
    System.out.printf("You said: %s.\n", greeting);
    kbd.nextLine(); 
    System.out.print("Hi. Please enter a greeting in more than one word: ");
    greeting = kbd.nextLine();
    System.out.printf("You said: %s.\n", greeting);
  }
}
