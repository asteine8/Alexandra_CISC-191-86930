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
 * ElectricMountainBike is a Bicyle that is Movable, Gearable, and Electric
 */

// TODO: Implement and comment all IS-A (inheritance) and IS (implements) relationships separately

public class ElectricMountainBike extends Bicycle implements Gearable, Movable, Electric {
	
	private int charge = 0;
	private int speed = 0;
	private int gear = 1;
	
	/**
	 * Create new ElectricMountainBike with a specified make 
	 * @param newMake
	 */
	public ElectricMountainBike(String newMake) {
		super(newMake);
	}
	
	/**
	 * Create new ElectricMountainBike with a specified make and color
	 * @param newMake
	 * @param newColor
	 */
	public ElectricMountainBike(String newMake, Color newColor) {
		super(newMake);
		
		super.color = newColor;
	}

	/**
	 * Returns the charge left in the electric mountain bike
	 * 
	 * @return charge
	 */
	public int getCharge() {
		return charge;
	}

	/**
	 * Returns the speed of the bike
	 * 
	 * @return speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * Returns the gear of the bike
	 * 
	 * @return gear
	 */
	public int getGear() {
		// TODO Auto-generated method stub
		return gear;
	}
	
	/**
	 * 
	 */
	public void charge(int amountToCharge) {
		charge += amountToCharge;
	}
	
	@Override
	public boolean equals(Object obj) {
		// Check if obj is null
		if (obj == null) return false;
		
		// Check if obj is actually an electric mountain bike
		if (!(obj instanceof ElectricMountainBike)) return false;
		
		ElectricMountainBike bike = (ElectricMountainBike)obj;
		// Check if the fields for make and color are null
		if (bike.make == null || bike.color == null) return false;
		
		// Check if the makes and colors match
		if (bike.make == super.make && bike.color.equals(super.color)) return true;
		else return false;
	}
	
	@Override
	public String toString() {
		return String.format("ElectricMountainBike: make: %s wheels: %d color: %s", super.make, super.numWheels, super.color.toString());
	}
}
