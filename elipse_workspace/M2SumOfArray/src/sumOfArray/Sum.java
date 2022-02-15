package sumOfArray;

public class Sum {
	
	public static int[] array = {1,2,3,4,5,6,7,8,9};

	public static void main(String[] args) {
		
		int runningTotal = 0;
		
		// Iterate through array in range [0,N)
		for (int i = 0; i < array.length; i++) {
			
			// Add element to the running total
			runningTotal += array[i];
		}
		
		// Print out sum of array
		System.out.println(runningTotal);
	}

}
