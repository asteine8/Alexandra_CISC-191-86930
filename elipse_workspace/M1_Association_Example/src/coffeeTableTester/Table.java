package coffeeTableTester;

public class Table {
	private Coffee[] coffeesOnTable;
	
	public Table(Coffee... coffees) {
		coffeesOnTable = coffees;
	}
	
	public String toString() {
		String output = "A table with";
		
		// Put coffees into a nice grammatically correct list
		for (int c = 0; c < coffeesOnTable.length-1; c++) {
			output += String.format(" a %s,",coffeesOnTable[c].toString());
		}
		output += String.format(" and a %s", coffeesOnTable[coffeesOnTable.length-1].toString());
		
		return output;
	}
}
