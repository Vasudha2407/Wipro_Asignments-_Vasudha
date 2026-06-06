package day02;
import java.util.Scanner;

public class loop_q3 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int option;

	        do {
	            System.out.println("\n--- ATM ---");
	            System.out.println("1. Balance");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("0. Quit");
	            System.out.print("Select: ");
	            option = sc.nextInt();

	            if (option == 1) {
	                System.out.println("Balance is 1000");
	            } else if (option == 2) {
	                System.out.println("Deposit chosen");
	            } else if (option == 3) {
	                System.out.println("Withdraw chosen");
	            } else if (option != 0) {
	                System.out.println("Invalid option");
	            }

	        } while (option != 0);

	        sc.close();
	}

}
