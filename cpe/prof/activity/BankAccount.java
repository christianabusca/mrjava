package cpe.prof.activity;

public class BankAccount {
	static double x;
	static double y;
	static double total = 5000;
	public void deposit(double deposit) {
		x = deposit;
		total += x;
		System.out.println("You deposit a "
				+ "total amount of " + x);
		System.out.println("Now you have "
				+ "a total amount of " + total);
	}
	
	
	public void withdraw(double withdraw) {
		y = withdraw;
		if (total - y >= 100) {
			total -= y;
			System.out.println("You withdraw " + y);
			System.out.println("Now you only "
					+ "have a total of " + total);
		} else {
			System.out.println("You cannot "
					+ "withdraw that will "
					+ "make you balance below 100 ");
		}
	}
}
