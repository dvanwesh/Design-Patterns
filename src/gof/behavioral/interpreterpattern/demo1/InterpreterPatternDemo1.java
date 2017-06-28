package gof.behavioral.interpreterpattern.demo1;
/**
 * Interpreter pattern provides a way to evaluate language grammar or expression. This type of pattern comes under behavioral pattern. This pattern involves implementing an expression interface which tells to interpret a particular context. This pattern is used in SQL parsing, symbol processing engine etc.
 * @author Anwesh
 *
 */
public class InterpreterPatternDemo1 {
	public static Expression getCarExpression() {
		Expression exp1 = new TerminalExpression("Honda");
		Expression exp2 = new TerminalExpression("Tesla");
		return new OrExpression(exp1, exp2);
	}

	public static Expression getWcExpression() {
		Expression exp1 = new TerminalExpression("Tlite");
		Expression exp2 = new TerminalExpression("AeroZ");
		return new AndExpression(exp1, exp2);
	}

	public static void main(String[] args) {
		Expression car = getCarExpression();
		Expression wc = getWcExpression();
		System.out.println("Honda is a car: " + car.interpret("Tesla"));
		System.out.println("Tilite is a wheelchair: "
				+ wc.interpret("Tlite AeroZ"));
	}
}
