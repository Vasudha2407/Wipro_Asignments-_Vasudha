package day05;

public class Test {
	public final void processPayment() {
        System.out.println("Processing secure payment...");
    }

    public static void main(String[] args) {
        CreditCardPayment obj = new CreditCardPayment();
        obj.processPayment();
        obj.paymentType();
    }

}
class CreditCardPayment extends Payment {

    public void paymentType() {
        System.out.println("Credit Card Payment");
    }
}
