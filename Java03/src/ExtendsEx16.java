//익명클래스
interface Operate {
	int operate(int a, int b);
}
class Calculator{
	private final int a;
	private final int b;

	public Calculator(int a, int b){
		this.a=a;
		this.b=b;
	}

	public int calculate(Operate op){
		return op.operate(a, b);
	}
}
public class ExtendsEx16 {
	public static void main(String[] args) {
		int num1=10;
		int num2=20;

		Calculator cal = new Calculator(num1, num2);
		
		int result = cal.calculate((a, b) -> a*b);

		System.out.println(result);
		
	}
}
