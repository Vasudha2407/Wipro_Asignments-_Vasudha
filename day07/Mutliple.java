package day07;
class FoodTask implements Runnable {
    private String taskName;

    FoodTask(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + " started: " + taskName);

            for (int i = 1; i <= 3; i++) {
                System.out.println(t.getName() + " processing " + taskName + " step " + i);
                Thread.sleep(1000); // simulate work
            }

            System.out.println(t.getName() + " completed: " + taskName);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Interrupted: " + taskName);
        }
    }
}

public class Mutliple {
    public static void main(String[] args) {

        // Creating tasks
        Thread t1 = new Thread(new FoodTask("Order Processing"));
        Thread t2 = new Thread(new FoodTask("Payment Processing"));
        Thread t3 = new Thread(new FoodTask("Notification"));

        // setName()
        t1.setName("Thread-Order");
        t2.setName("Thread-Payment");
        t3.setName("Thread-Notification");

        // setPriority()
        t1.setPriority(Thread.MAX_PRIORITY);   // high priority
        t2.setPriority(Thread.NORM_PRIORITY);  // normal
        t3.setPriority(Thread.MIN_PRIORITY);   // low

        // start()
        t1.start();

        try {
            // isAlive()
            System.out.println(t1.getName() + " alive? " + t1.isAlive());

            // join()
            t1.join(); // wait for order to complete

            t2.start();
            t2.join(); // wait for payment

            t3.start();
            t3.join(); // wait for notification

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("All tasks finished");
    }

}
