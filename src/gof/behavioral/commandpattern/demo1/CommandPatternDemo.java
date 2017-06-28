package gof.behavioral.commandpattern.demo1;

/**
 * Command pattern is a data driven design pattern and falls under behavioral
 * pattern category. A request is wrapped under an object as command and passed
 * to invoker object. Invoker object looks for the appropriate object which can
 * handle this command and passes the command to the corresponding object which
 * executes the command.
 * 
 * @author Anwesh
 * 
 */
public class CommandPatternDemo {
	public static void main(String[] args) {
		Player p = new Player("Anvy");
		ForeHandStroke fStroke = new ForeHandStroke(p);
		BackHandStroke bStroke = new BackHandStroke(p);
		Coach c = new Coach();
		c.strategizeShots(fStroke);
		c.strategizeShots(bStroke);
		c.hitShots();
	}
}
