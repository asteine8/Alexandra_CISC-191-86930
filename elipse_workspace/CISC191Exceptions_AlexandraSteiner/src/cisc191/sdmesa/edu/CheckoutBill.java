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
 * A basic checkout bill class that represents bills with both a bill amount and tip percentage. Has methods
 * to set bill amount, tip percentage, and calculate the final bill
 */

public class CheckoutBill {
	private double billAmount = 0;
	private double tipPercent = -1;

	/**
	 * Set the amount from which to calculate the total bill
	 * 
	 * @param amount
	 * @throws IllegalArgumentException is thrown if amount is not positive
	 */
	public void setBillAmount(double amount) throws IllegalArgumentException {
		if (amount <= 0) {
			throw new IllegalArgumentException(String.format("Negative or 0 amount: %.1f is not allowed", amount));
		}
		billAmount = amount;
	}

	/**
	 * Set the tip percent from which to calculate the total bill
	 * 
	 * @param percent: the new tip percent
	 * @throws IllegalArgumentException is thrown if amount is negative
	 */
	public void setTipPercent(double percent) throws IllegalArgumentException {
		if (percent < 0) {
			throw new IllegalArgumentException(String.format("Negative amount: %.1f is not allowed", percent));
		}
		tipPercent = percent;
	}

	/**
	 * Calculate the total bill from the bill amount and tip percentage
	 * 
	 * @throws IllegalArgumentException is thrown if bill amount is not positive or
	 *                                  tip percent is negative
	 */
	public double calculateTotalBill() throws IllegalArgumentException {
		if (billAmount <= 0) {
			throw new IllegalArgumentException(String.format("Negative or 0 amount: %.1f is not allowed", billAmount));
		} else if (tipPercent < 0) {
			throw new IllegalArgumentException(String.format("Negative amount: %.1f is not allowed", tipPercent));
		}
		return billAmount * (1 + tipPercent / 100);
	}

	public static void main(String[] args) {
		CheckoutBill bill = new CheckoutBill();
		bill.setTipPercent(18);
		
		// prevent the program from crashing when calculating total with 0 billAmount
		try {
			bill.calculateTotalBill();
		} catch (IllegalArgumentException e) {
			// Log the catched exception to the the OutputStream
			System.out.println(e);
		}
		
	}

}
