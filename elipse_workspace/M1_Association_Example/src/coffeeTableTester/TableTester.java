package coffeeTableTester;

public class TableTester {

	public static void main(String[] args) {
		// Make some coffee (Forgive me for not drinking coffee)
		Coffee expresso = new Coffee("expresso");
		Coffee decaf = new Coffee("decaf");
		Coffee regular = new Coffee();
		Coffee hairball = new Coffee("hairball");
		
		// Make some tables
		Table table1 = new Table(expresso, regular, hairball);
		Table table2 = new Table(regular, decaf);
		
		// Report on these tables (very suspicious tables)
		System.out.println("Tables:");
		System.out.println(table1.toString());
		System.out.println(table2.toString());

	}

}
