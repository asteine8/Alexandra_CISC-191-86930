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
 * A a Bicycle is a Cycle with two wheels
 */

// TODO: Implement and comment all IS-A (inheritance) and IS (implements) relationships separately

public class Bicycle extends Cycle {
	
	/**
	 * 
	 * @param newMake
	 */
	public Bicycle(String newMake) {
		super(newMake);
		
		super.numWheels = 2;
	}

	/**
	 * 
	 */
	@Override
	int getNumberOfWheels() {
		return super.numWheels;
	}
	
	/**
	 * 
	 */
	@Override
	Color getColor() {
		return super.color;
	}
	
	/**
	 * 
	 */
	@Override
	void setColor(Color newColor) {
		super.color = newColor;
	}
	

}
