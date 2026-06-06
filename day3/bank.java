package day3;

public class bank {
	private double balance;
	public BankAccount(double balance) {
		this.balance=balance;
		
	}
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("deposited:"+amount);
		}
	}
	public void withdraw(double amount) {
		if (amount>0&& amount<=balance) {
			balance-=amount;
			System.out.println("withdrawn:"+amount);
		}
		else {
			System.out.println("invalid withdrawal");
		}
	}
	public double getbalance() {
		return balance;
	}
	

}

