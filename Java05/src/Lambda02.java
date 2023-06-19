import java.util.function.DoubleBinaryOperator;

enum Oper02{
	PLUS("+", (x, y) -> x+y),
	MINUS("-", (x, y) -> x-y),
	TIMES("*", (x, y) -> x*y);
	
	private final String SYMBOL;
	private final DoubleBinaryOperator OP;
	
	Oper02(String sym, DoubleBinaryOperator op){
		this.SYMBOL=sym;
		this.OP = op;
	}
	
	public void apply(double x, double y) {
		System.out.println(OP.applyAsDouble(x, y));
	}
	
	@Override
	public String toString() {return SYMBOL;}
}
public class Lambda02 {
	public static void main(String[] args) {
		Oper02.PLUS.apply(10, 20);
	}
}
