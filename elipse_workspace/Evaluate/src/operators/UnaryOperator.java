package operators;

import evaluate.Expression;
import java.lang.Number;
 

public abstract class UnaryOperator extends Operator {

	private Object operand1;
	
	public UnaryOperator(Object op1) {
		// operand1 is null, throw an invalid operand exception
		if (op1 == null) {
			throw new InvalidOperandException(operand1);
		}
		// operand1 is not a valid type
		else if (!(op1 instanceof Operator || op1 instanceof Expression || op1 instanceof Number)) {
			throw new InvalidOperandException(operand1);
		}
		
		operand1 = op1;
	}
	
	public Number evaluate() {
		Number result = null;
		
		// Handle non-numeric operands
		// If the operand is an Operator, evaluate the Operator first
		if (operand1 instanceof Operator) {
			result = ((Operator) operand1).evaluate();
		}
		// If the operand is an Expression, evaluate the Expression first
		else if (operand1 instanceof Expression) {
			result = ((Expression) operand1).evaluate();
		}
		// If the operand is a Number, don't modify it
		else if (operand1 instanceof Number) {
			result = (Number)operand1;
		}
		
		// Return the result after the operator
		return operate(result);
	}
	
	public abstract Number operate(Integer op1);
	public abstract Number operate(Double op1);
}
