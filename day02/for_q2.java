package day02;
import java.util.Scanner;

public class for_q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        String savedPass = "vasudha";
        int triesLeft = 3;

        while (triesLeft > 0) {
            System.out.print("Password: ");
            String entered = input.nextLine();

            if (entered.equals(savedPass)) {
                System.out.println("Welcome!");
                return;
            } else {
                triesLeft--;
                System.out.println("Incorrect! Remaining: " + triesLeft);
            }
        }

        System.out.println("Too many failed attempts.");
        input.close();
	}

}
