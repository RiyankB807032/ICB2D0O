// any import statements go here!
import java.util.Scanner;

public class UnicodeAndEmojis {
    public static void main(String[] args) {
        // Your code goes here!
        long smiley = 0x1f600;
        for(long x = smiley; x < (smiley + 80); x++) {
        String uChar = new String(Character.toChars((int) x));
        System.out.printf("%4h\t%s\n", x, uChar);
        // Yout code stops here!
    }
}
}
