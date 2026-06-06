package Day_12;
import java.io.*;

import java.util.*;
public class FoodDelivery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Menu
            System.out.print("Enter Food Item: ");
            String item = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            FileWriter menu = new FileWriter("menu.txt", true);
            menu.write(item + "," + price + "\n");
            menu.close();

            // Order
            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Order Item: ");
            String order = sc.nextLine();

            FileWriter orderFile = new FileWriter("customerorders.txt", true);
            orderFile.write(name + "," + order + "\n");
            orderFile.close();

            // Delivery Log
            FileWriter log = new FileWriter("delivery.txt", true);
            log.write(name + " ordered " + order + " - Delivered\n");
            log.close();

            System.out.println("Menu, Order & Delivery saved!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}