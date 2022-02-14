package sumOfArray;

public class Sum {
	
	public static int[] array = {1,2,3,4,5,6,7,8,9};

	public static void main(String[] args) {
		
		int runningTotal = 0;
		
		// Iterate through array
		for (int i : array) {
			runningTotal += i;
		}

		System.out.println(runningTotal);
	}

}
