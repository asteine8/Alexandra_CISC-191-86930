package evaluate;

public class Equation {
	
	private String equationText;
	Expression expressions[];

	public Equation(String text) {
		equationText = text;
	}
	
	/**
	 * Attempts to solve the equation
	 * @return a string representing the equation in its solved state
	 */
	public String solve() {
		return null;
	}
	
	/**
	 * Attempts to generate expressions from the provided equationText
	 * @return false if expressions could not be generated
	 */
	public boolean generateExpressions() {
		return false;
	}

}
