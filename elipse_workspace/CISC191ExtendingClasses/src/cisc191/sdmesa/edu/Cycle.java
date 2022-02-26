package cisc191.sdmesa.edu;

import java.awt.Color;

/**
 * Lead Author(s):
 * @author 
 * @author 
 * <<add additional lead authors here, with a full first and last name>>
 * 
 * Other contributors:
 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 
 * 
 * Responsibilities of class:
 * 
 */
/**
 * Only change sections that are marked with TODO
 */

//TODO: Implement and comment all IS-A (inheritance) relationships

public abstract class Cycle  {	
	protected String make;
	protected Color color;
	protected int numWheels;
	
	/**
	 * 
	 * @param newMake
	 */
	public Cycle(String newMake) {
		make = newMake;
	}

	abstract int getNumberOfWheels();

	/**
	 * 
	 * @return the color of the bike; can be null
	 */
	abstract Color getColor();

	/**
	 * Changes the color of the bike
	 * 
	 * @param newColor
	 */
	abstract void setColor(Color newColor);
	
	/**
	 * 
	 * @return
	 */

	/**
	 * 
	 * @return make or brand that was set when the bike was made
	 */
	final String getMake() {
		return make;
	}

	/**
	 * 
	 * @return
	 */
	public String getDescription() {
		return String.format("%s %d wheels %s", make, numWheels, color.toString());
	}
}
