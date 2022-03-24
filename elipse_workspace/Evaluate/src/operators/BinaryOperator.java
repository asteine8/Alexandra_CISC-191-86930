package operators;

public abstract class BinaryOperator extends Operator {
	
	private Object operand1;
	private Object operand2;
	
	public BinaryOperator(Object op1, Object op2) {
		operand1 = op1;
		operand2 = op2;
	}
	
	public Number evaluate() {		
		return operate(operand1, operand2);
	}
	
	
	public abstract Number operate(Object op1, Object op2);
	
}
