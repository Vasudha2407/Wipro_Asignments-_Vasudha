package Day_12;
import java.io.*;
import java.util.Scanner;

public class Banking {

    static Scanner sc = new Scanner(System.in);

  
    public static void saveAccount() {
        try {
            FileWriter fw = new FileWriter("account.txt");

            System.out.print("Enter Account Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Balance: ");
            double balance = sc.nextDouble();
            sc.nextLine();

            fw.write(name + "," + balance + "\n");
            fw.close();

            System.out.println("Account saved successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

  
    public static void readAccount() {
        try {
            FileReader fr = new FileReader("account.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("No account data found.");
        }
    }


    public static void addTransaction() {
        try {
            FileWriter fw = new FileWriter("transactions.txt", true);

            System.out.print("Enter Type (Deposit/Withdraw): ");
            String type = sc.nextLine();

            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Date: ");
            String date = sc.nextLine();

            fw.write(type + "," + amount + "," + date + "\n");
            fw.close();

            System.out.println("Transaction saved!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // View Transactions
    public static void viewTransactions() {
        try {
            FileReader fr = new FileReader("transactions.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("No transactions found.");
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1.Save Account\n2.View Account\n3.Add Transaction\n4.View Transactions\n5.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1: saveAccount(); break;
                case 2: readAccount(); break;
                case 3: addTransaction(); break;
                case 4: viewTransactions(); break;
                case 5: System.exit(0);
            }
        }
    }
}