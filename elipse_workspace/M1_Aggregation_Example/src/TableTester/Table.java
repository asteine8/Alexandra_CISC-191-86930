package TableTester;

/**
 * A class representing a typical table. Implements an overridden toString method
 * that returns information about the table. Makes tables for eating on (not spreadsheets)
 * @author Alexandra Steiner
 */
public class Table {
	private Leg[] legs;
	private SurfaceFinish finish;
	private String name;
	
	public Table(String tableName, String fType, int numLegs) {
		// Populate table with legs and give them all names
		legs = new Leg[numLegs];
		for (int l = 0; l < numLegs; l++) {
			legs[l] = new Leg(String.format("%s_leg%d", tableName, l));
		}
		
		// Initialize finish with the type specified
		finish = new SurfaceFinish(fType);
		
		name = tableName;
	}
	
	/**
	 * @return Information about the table's legs and finish
	 */
	public String toString() {
		String output = "";
		output = String.format("A %s with a %s finish and %d legs", name, finish, legs.length);
		return output;
	}
	
	/**
	 * A class to store Surface Finish type for tables
	 * @author Alexandra Steiner
	 */
	private class SurfaceFinish {
		private String finishType;
		
		public SurfaceFinish (String fType) {
			finishType = fType;
		}
		
		public String toString() {
			return finishType;
		}
	}
	
	/**
	 * A placeholder class for Legs to give us something else to look at
	 * @author Alexandra Steiner
	 */
	private class Leg {
		private String name;
		
		public Leg(String n) {
			name = n;
		}
	}
}

