package Day_12;
import java.io.*;
import java.util.Scanner;

public class Ecommerce {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Order ID: ");
            int id = sc.nextInt(); sc.nextLine();

            System.out.print("Enter Product Name: ");
            String product = sc.nextLine();

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Customer Name: ");
            String cname = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

           
            FileWriter orderFile = new FileWriter("orders.txt", true);
            orderFile.write(id + "," + product + "," + qty + "," + price + "\n");
            orderFile.close();

            FileWriter shipFile = new FileWriter("shipping.txt", true);
            shipFile.write(cname + "," + address + "\n");
            shipFile.close();

            FileWriter invoice = new FileWriter("invoice_" + id + ".txt");
            invoice.write("Invoice ID: " + id + "\n");
            invoice.write("Product: " + product + "\n");
            invoice.write("Quantity: " + qty + "\n");
            invoice.write("Total: " + (qty * price));
            invoice.close();

            System.out.println("Order, Shipping & Invoice saved!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}