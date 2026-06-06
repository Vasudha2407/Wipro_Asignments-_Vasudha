package day02;

public class q1 {
	public static void main(String[] args) {
		double amount = 750;   
        double discount = 0;

        if (amount >= 1000) {
            discount = amount * 0.20;
        } else if (amount >= 500) {
            discount = amount * 0.10;
        } else {
            discount = 0;
        }

        double finalAmount = amount - discount;

        System.out.println("Purchase Amount: " + amount);
        System.out.println("Discount: " + discount);
        System.out.println("Amount to Pay: " + finalAmount);
	}

}
