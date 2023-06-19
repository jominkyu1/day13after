@FunctionalInterface
interface Adder{
	public static void pr() {
		System.out.println("pr");
	}
	
	public int add(int x, int y);
	
	default void pr2() {System.out.println("pr2");}
}

public class Lambda01 {
	public static void main(String[] args) {
		Adder adder = (x, y) -> x+y;
		
		int result = adder.add(5, 10);
		
		System.out.println(result);
		
		Adder.pr();
	}
}