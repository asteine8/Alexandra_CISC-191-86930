package cisc191.sdmesa.edu;

import java.awt.Color;

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
 * w3schools (2022). Java Interface. w3schools.com. Retrieved from: https://www.w3schools.com/java/java_interface.asp
 * 
 * Version/date: 1.0 - 2/25/22
 * 
 * Responsibilities of class:
 * ElectricMountainBike is a Bicyle that implements the Movable, Gearable, and Electric interfaces. ElectricMountainBike
 * also has toString and equals methods for general utility.
 */
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
		return gear;
	}
	
	/**
	 * Charges the bike by the specified amount
	 * @param amountToCharge: how much to charge the bike
	 */
	public void charge(int amountToCharge) {
		charge += amountToCharge;
	}
	
	/**
	 * Compares the provided object with this bike and returns true if the makes and colors match
	 * Will return false if the provided object is null, its fields are null, or if it is not an
	 * instance of the ElectricMountainBike class
	 * 
	 * @param obj: the object to compare with this electric mountain bike
	 */
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
		if (bike.make.equals(super.make) && bike.color.equals(super.color)) return true;
		else return false;
	}
	
	/**
	 * Converts the ElectricMountainBike into a formatted string that represents the ElectricMountainBike
	 * 
	 * @return the formatted string
	 */
	@Override
	public String toString() {
		return String.format("ElectricMountainBike: make: %s wheels: %d color: %s", super.make, super.numWheels, super.color.toString());
	}
}
