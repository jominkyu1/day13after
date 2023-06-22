
import java.util.function.DoubleBinaryOperator;

enum IOper{
	PLUS("P", (x, y) -> x+y),
	MINUS("M", (x, y) -> x-y),
	MULTIPLE("M", (x, y) -> x*y);
	
	private final String symbol;
	private final DoubleBinaryOperator op;
	
	IOper(String symbol, DoubleBinaryOperator op){
		this.symbol=symbol;
		this.op=op;
	}
	
	public double calc(double x, double y) {
		return op.applyAsDouble(x, y);
	}
	
	@Override
	public String toString() {
		return this.symbol;
	}
}

public class Lambda02 {
	public static void main(String[] args) {
		System.out.println(IOper.PLUS.toString());
		System.out.println(IOper.PLUS.calc(10.6, 20.2));
		
		System.out.println(IOper.MINUS.toString());
		System.out.println(IOper.MINUS.calc(50, 20));
		
		System.out.println(IOper.MULTIPLE.toString());
		System.out.println(IOper.MULTIPLE.calc(20, 6));
		
		
	}
}
