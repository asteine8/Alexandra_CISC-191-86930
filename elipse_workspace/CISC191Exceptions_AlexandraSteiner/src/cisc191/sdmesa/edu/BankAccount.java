package cisc191.sdmesa.edu;

/**
 * Lead Author(s):
 * @author Alexandra Steiner
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * mkyong (July, 2020). How to format a double in Java. Mkyong. Retrieved from: 
 * https://mkyong.com/java/how-to-format-a-double-in-java/
 * 
 * Version/date: 1.0 - 3/8/22
 * 
 * Responsibilities of class:
 * A basic bank account that holds a balance and has methods for depositing, withdrawing, and attempting to withdraw
 * an amount that may be larger than the account balance
 */

public class BankAccount {
	private double balance = 0;

	/**
	 * @return the current balance in this account
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Deposit amount into account
	 * 
	 * @param amount: how much to deposit
	 * @throws InvalidAmountException is thrown if amount is not positive
	 */
	public void deposit(double amount) {
		if (amount < 0) {
			throw new InvalidAmountException(String.format("Negative amount: %.1f is not allowed", amount));
		}
		balance += amount;
	}

	/**
	 * Withdraw amount from account
	 * 
	 * @param amount: how much to withdraw
	 * @throws InvalidAmountException     is thrown if amount is not positive
	 * @throws InsufficientFundsException is thrown if there is not enough funds in
	 *                                    the account to make the withdrawal
	 */
	public void withdraw(double amount) {
		// Catch negative amounts
		if (amount < 0) {
			throw new InvalidAmountException(String.format("Negative amount: %.1f is not allowed", amount));
		} 
		
		// Don't let us withdraw more than is in the account
		else if (amount > balance) {
			throw new InsufficientFundsException(balance, amount);
		}
		
		balance -= amount;
	}

	/**
	 * Deposit $400 and attempt to withdraw money
	 * 
	 * @param requestAmount: how much to attempt to withdraw from this account
	 * @return the requestAmount or remaining balance
	 */
	public static double getOrAsMuchAsPossible(double requestAmount) {
		double amount = 0;
		BankAccount account = new BankAccount();
		account.deposit(400);

		// Try to get requestAmount
		amount = requestAmount;
		
		// Wrap the withdraw in a try catch to catch expected InsufficientFundsException
		try {
			account.withdraw(requestAmount);
		} catch (InsufficientFundsException e) { // Trying to withdraw too much
			System.out.println(e);
			
			amount = account.getBalance(); // Only withdraw what we have
			account.withdraw(amount);
		}
		
		return amount;
	}

}
