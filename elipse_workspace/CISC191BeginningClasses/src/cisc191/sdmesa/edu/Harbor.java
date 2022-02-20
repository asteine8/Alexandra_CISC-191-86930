package cisc191.sdmesa.edu;

/**
 * Lead Author(s):
 * @author Shane Hage
 * @author Alexandra Steiner
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * Version/date: 1.2 - 2/20/2022
 * 
 * Responsibilities of class: A harbor that can hold an array of boat objects based on the specified value in the numBoats parameter in the constructor.
 * The getBoatAt method will return the boat at the specified slipNumbers parameter.
 * parkBoat will park a boat at specified slipNumber parameter, then will either return the previous boat parked, or null if there was no boat parked there before.
 * getInventory will return a copy of the harbor's current inventory.
 * 
 */
public class Harbor {

	private Boat boats[];
	
	/**
	 * Constructor for Harbor. Initializes boats array with specifies number of empty boats
	 * @param numBoats
	 */
	public Harbor (int numBoats) {
		boats = new Boat[numBoats];
	}
		
	/**
	 * Returns the boat at the specified slip-number
	 * @param slipNumber
	 * @return the boat at slipNumber
	 */
	public Boat getBoatAt(int slipNumber) {
		// Handle slipNumbers out of array index range
		if (slipNumber >= boats.length || slipNumber < 0) return null;
		
		// Return the boat
		return boats[slipNumber];
	}
	
	/**
	 * Parks boat at the specified slipNumber in the harbor and returns the boat that
	 * was previously parked there
	 * @param boat
	 * @param slipNumber
	 * @return the boat previously parked at the slipNumber
	 */
	public Boat parkBoatAt(Boat boat, int slipNumber) {
		// Assign the old boat to a temp variable
		Boat temp = boats[slipNumber];
		
		// Park the new boat into the harbor
		boats[slipNumber] = boat;
		
		// Return the old boat
		return temp;
		
	}
	
	/**
	 * Returns the boat inventory in the harbor. Returns as a copied array so boats can't
	 * be modified by operations to the returned inventory
	 * @return the boats
	 */
	public Boat[] getInventory() {
		return boats.clone();
	}
}
