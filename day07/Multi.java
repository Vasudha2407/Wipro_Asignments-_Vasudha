package day07;
class Order implements Runnable {
    public void run() {
        
            System.out.println("Order Processing...");
        
    }
}
class Payment implements Runnable {
    public void run() {
       
            System.out.println("Payment Processing...");
 
    }
}
class Notification implements Runnable {
    public void run() {
            System.out.println("Sending Notification...");
    }
}


public class Multi {
	public static void main(String[] args) {

        Order o = new Order();
        Payment p = new Payment();
        Notification n = new Notification();
        Thread t1 = new Thread(new Order());
        Thread t2 = new Thread(new Payment());
        Thread t3 = new Thread(new Notification());

        t1.start();
        t2.start();
        t3.start();
    }

}
