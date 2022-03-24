package operators;

public class InvalidOperandException extends RuntimeException {

	private static final long serialVersionUID = 15L;

	public InvalidOperandException() {
		// TODO Auto-generated constructor stub
	}

	public InvalidOperandException(String message) {
		super(message);
	}
	
	/**
	 * Converts an invalidOperand object to a string. Handles null values
	 * @param invalidOperand the operand that is invalid
	 */
	public InvalidOperandException(Object invalidOperand) {
		super(String.format("Operand: %s is not a valid operand", (invalidOperand == null ? "null" : invalidOperand.toString())));
	}

}
