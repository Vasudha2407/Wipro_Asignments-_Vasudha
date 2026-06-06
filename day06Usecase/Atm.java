package day06Usecase;
import java.util.*;
class InvalidPINException extends Exception{
	public InvalidPINException(String message) {
		super(message);
	}
	
}

public class Atm {
    static void checkPIN(int enteredPIN) throws InvalidPINException {
        int correctPIN = 1234;  

        if (enteredPIN != correctPIN) {
            throw new InvalidPINException("Incorrect PIN entered!");
        } else {
            System.out.println("PIN verified successfully.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Insert your ATM card...");
            System.out.print("Enter your PIN: ");
            int pin = sc.nextInt();

            checkPIN(pin);

            System.out.println("Access granted. You can proceed with transactions.");

        } catch (InvalidPINException e) {
            System.out.println("Exception: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numbers only.");

        } finally {
            System.out.println("Transaction logged. Thank you for using ATM.");
            sc.close();
        }
    }
}

