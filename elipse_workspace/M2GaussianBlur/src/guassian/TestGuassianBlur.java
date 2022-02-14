package guassian;

public class TestGuassianBlur {
	
	private static int array[][] = {{110,150,250,100,661},
									{450,100,300,150,100},
									{111,212,292,643,100},
									{345,123,432,333,111},
									{111,212,292,643,100}};

	public static void main(String[] args) {
		
		display2DArray(GaussianBlur.blur(array));

	}
	
	private static void display2DArray(int[][] array) {
		String output = "";
		for (int y = 0; y < array.length; y++) {
			for (int x = 0; x < array[y].length-1; x++) {
				output += array[y][x];
				output += ",";
			}
			output += array[y][array.length-1];
			output += "\n";
		}
		
		System.out.print(output);
	}

}
