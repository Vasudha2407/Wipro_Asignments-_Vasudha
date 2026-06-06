package day07;
class DeliverySystem {
    private int completedTasks = 0;

    public synchronized void processTask(String name) {
        try {
            System.out.println(name + " started");

            Thread.sleep(2000); 

            completedTasks++;
            System.out.println(name + " completed | Total done: " + completedTasks);

        } catch (InterruptedException e) {
            System.out.println(name + " interrupted");
        }
    }
}

class FoodDelivery extends Thread {

    DeliverySystem system;

    public FoodDelivery(String name, DeliverySystem system) {
        setName(name);
        this.system = system;
    }

    public void run() {
        system.processTask(getName()); 
    }
}


public class Sync {
	 public static void main(String[] args) throws InterruptedException {

	        DeliverySystem system = new DeliverySystem(); 

	        FoodDelivery order = new FoodDelivery("Order Processing", system);
	        FoodDelivery kitchen = new FoodDelivery("Kitchen Processing", system);
	        FoodDelivery delivery = new FoodDelivery("Delivery", system);

	       
	        order.setPriority(Thread.MAX_PRIORITY);
	        kitchen.setPriority(Thread.NORM_PRIORITY);
	        delivery.setPriority(Thread.MIN_PRIORITY);

	  
	        order.start();
	        kitchen.start();

	        System.out.println("Is order Alive? " + order.isAlive());

	        order.join();
	        kitchen.join();

	        delivery.start();
	        delivery.join();

	        System.out.println("All tasks completed.");
	    }

}
