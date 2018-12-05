package ch09_prj2_AccountBalanceCalculator;

public class AccountBalance {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the Account application");
		
		// declare Checking Account and Savings
		CheckingAccount ca = new CheckingAccount(1.00);
		ca.setBalance(1000.0);
		
		SavingsAccount sa = new SavingsAccount(.01);
		sa.setBalance(1000.0);
		
		System.out.println("Starting Balances");
		displayBalances(ca, sa);
		
		System.out.println("Enter the transactions for the month");
		
		String choice = "y";
		Console c = new Console();
		while(choice.equalsIgnoreCase("y")) {
			System.out.println("Enter the transactions for the month");
			
			String transType = c.getString("Withdrawal or deposit? (w/d): ");
			String acctType = c.getString("Checking or savings? (c/s): ");
			double amount = c.getDouble("Amount?: ");
			
			
			// update balances 
			Account a = null;
			if (acctType.equalsIgnoreCase("c")) 
				a = ca;
			else
				a = sa;
			
			if (transType.equalsIgnoreCase("w")) 
				a.withdraw(amount);
				else
				a.deposit(amount);
			
			
			choice = c.getString("Continue? (y/n): ");	
		}
		
		// apply interest and fees
		ca.subtractMonthlyFeeFromBalance();
		sa.applyPmtToBalance();

		// Monthly Payment Fees Summary
		System.out.println("Monthly Payments and Fees");
		System.out.println("Checking fee" + ca.getMonthlyFee());
		System.out.println("Savings interest payment" + sa.getMonthlyInterestPmt());
		
		
		System.out.println("Final Balances");
		displayBalances(ca, sa);
		
		
	}
	
	private static void displayBalances(CheckingAccount ca, SavingsAccount sa) {
		System.out.println("Checking: " + ca.getBalance());
		System.out.println("Savings: " + sa.getBalance());
	}
}
