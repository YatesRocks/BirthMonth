import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.*;

public class Main {
    private static final Logger log = Logger.getLogger("Main");

    private static int get_int() {
        System.out.print("Please enter an integer: ");
        Scanner in = new Scanner(System.in);
        int res;
        try {
            res = in.nextInt();
        } catch (InputMismatchException e) {
            log.log(Level.WARNING, "Input an integer please, e.x. '10'");
            System.out.println("- - - -");
            return get_int();
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Tell me your birth month. Enter a number 1-12 inclusive.");
        int birth_month = get_int();
        while (birth_month < 1 || birth_month > 12) {
            System.out.println("You entered an incorrect month value: " + birth_month);
            System.out.println("Try again");
            birth_month = get_int();
        }
        System.out.println("Your birth month is: " + birth_month);
    }
}