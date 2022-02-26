package cisc191.sdmesa.edu;

/**
 * Lead Author(s):
 * @author Alexandra Steiner
 * @author Shane Hage
 * 
 * Other contributors:
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *  
 * Version/date: 1.1 - 2/26/22
 * 
 * Responsibilities of interface:
 * Specifies methods relating to the electric components of electric bikes.
 */
public interface Electric {
	/**
	 * @return the charge remaining in the object's reserves
	 */
	int getCharge();
	
	/**
	 * Adds an amount of charge to an object's energy reserves
	 * 
	 * @param amountToCharge: how much charge to add to the object's reserves
	 */
    void charge(int amountToCharge);
}
