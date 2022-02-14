package guassian;

public class GaussianBlur {
	
	/**
	 * A 3x3 discrete guassian blur kernel calculated using a sigma value of 1.0
	 * See https://en.wikipedia.org/wiki/Gaussian_blur for equation and details
	 */
	private static double gaussianKernel[][] = {{0.0585,0.0965,0.0585},
												{0.0965,0.1592,0.0965},
												{0.0585,0.0965,0.0585}};
	
	/**
	 * Applies a 3x3 discrete gaussian blur to the provided array. Only Applies blur
	 * to non-edge array values because I'm lazy ":(
	 * 
	 * @param array
	 * @return the blurred array
	 */
	public static int[][] blur(int[][] array) {
		// Clone the array so we don't modify the original array
		int blurredArray[][] = array.clone();
		
		// Cannot work with an array smaller than 3x3
		if (array.length < 3 || array[0].length < 3) return array;

		// Iterate through (x,y) in range [(1,1),(N-2,N-2)]
		// In other words, every (x,y) pair not touching the edge
		for (int x = 1; x < array.length-1; x++) {
			for (int y = 1; y < array[x].length-1; y++) {
				
				// Apply the convolution centered at (x,y) using a guassian kernel
				double g = 0;
				for (int relX = -1; relX < 2; relX++) {
					for (int relY = -1; relY < 2; relY++) {
						g += (double)array[x+relX][y+relY] * gaussianKernel[relX+1][relY+1];
					}
				}
				
				// Assign the convoluted value to the current (x,y)
				blurredArray[x][y] = (int)g;
			}
		}
		
		return blurredArray;
	}
}
