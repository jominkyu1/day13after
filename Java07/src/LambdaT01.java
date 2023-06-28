import java.util.ArrayList;

@FunctionalInterface
interface Func{
	void adder(int x, int y);
}
@FunctionalInterface
interface Func2{
	void show(String show);
}

public class LambdaT01 {
	public static void main(String[] args) {
		Func fc = (x, y) -> System.out.println(x+y);
		
		fc.adder(10, 20);
		
		Func2 fc2 = System.out::println;
		
		fc2.show("AAA");
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("A");
		arr.add("B");
		arr.add("C");
		
		System.out.println();
		arr.forEach(System.out::println);	
	}
}
