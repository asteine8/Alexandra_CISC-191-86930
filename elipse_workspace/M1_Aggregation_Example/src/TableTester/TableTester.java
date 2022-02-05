package TableTester;

public class TableTester {
	public static void main(String[] args) {
		// Create some tables
		Table woodTable = new Table("Wooden Table", "stained birch", 4);
		Table nightStand = new Table("Nightstand", "black glossy", 3);
		
		// Print out table info to console
		System.out.println("Tables: ");
		System.out.println(woodTable.toString());
		System.out.println(nightStand.toString());
	}
}
