import java.util.Scanner;

class Debugloopcode:AudioCD {
    public static void main(String[] args) {
        // set up keyboard for input
        Scanner keyboard = new Scanner(System.in);

        // declare variables
        int tracks = 0;
        double totalMinutes = 0;
        double minutes = 0.0;

        // INPUT
        System.out.print("How many tracks? : ");
        tracks = Integer.parseInt(keyboard.nextLine());

        // INPUT PROCESS OUTPUT loop
        for (int i = 0; i < tracks; i++) { // start loop
            System.out.print("How many minutes for track " + (i + 1) + " ? : "); // Corrected prompt
            minutes = Double.parseDouble(keyboard.nextLine());
            totalMinutes += minutes; // Accumulate the minutes into totalMinutes
        } // end loop

        // OUTPUT
        System.out.println("total running time: " + totalMinutes);
    }
}
