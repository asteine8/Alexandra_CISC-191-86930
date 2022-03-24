package evaluate;

import java.lang.Number;
import operators.Operator;

public class Expression {
	
	private String expressionText;
	private Operator baseOperator;

	public Expression(String text) {
		expressionText = text;
	}
	
	public Number evaluate() {
		return null;
	}
	
	/**
	 * Attempts to generate operators from expressionText
	 * @return false if operators could not be generated
	 */
	public boolean generateOperators() {
		return false;
	}

}
