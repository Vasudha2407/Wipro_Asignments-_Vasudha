package day05;
class account {
	private final int accountNumber;  
    private String customerName;

  
    public account(int accountNumber, String customerName) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
    }
    public static void main(String[] args) {
        account acc = new account(12345, "Vasudha");
        acc.display();

    }



}

    