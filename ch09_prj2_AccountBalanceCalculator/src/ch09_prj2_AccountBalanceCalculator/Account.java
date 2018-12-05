package ch09_prj2_AccountBalanceCalculator;

public class Account implements Depositable, Withdrawable, Balancable {
	
	private double balance;
	
	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void setBalance(double amount) {
		balance = amount;

	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;

	}

	@Override
	public void deposit(double amount) {
		balance += amount;

	}

}
