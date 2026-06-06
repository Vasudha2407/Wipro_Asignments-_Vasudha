package day05;

interface Payment {

    void pay(double amount);

    default void printReceipt(double amount) {
        System.out.println("Payment of ₹" + amount + " processed successfully.");
    }

    static void validateAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
    }
}

class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        Payment.validateAmount(amount);
        System.out.println("Processing credit card payment...");
        printReceipt(amount);
    }
}

class UpiPayment implements Payment {

    @Override
    public void pay(double amount) {
        Payment.validateAmount(amount);
        System.out.println("Processing UPI payment...");
        printReceipt(amount);
    }
}

class CashPayment implements Payment {

    @Override
    public void pay(double amount) {
        Payment.validateAmount(amount);
        System.out.println("Processing cash payment...");
        printReceipt(amount);
    }
}

public class Pay {

    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment();
        Payment p2 = new UpiPayment();
        Payment p3 = new CashPayment();

        p1.pay(1500);
        p2.pay(500);
        p3.pay(200);
    }
}