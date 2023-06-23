import java.util.Arrays;
import java.util.List;

class MyList15{
	public static void printList(List<?> list) { // 물음표만 입력시 모든타입 허용 
		
		for(Object obj:list) {
			System.out.print(" " + obj);
		}
		System.out.println("\n----");
	}
}

public class ListTest15 {
	public static void main(String[] args) {
		List<Double> li = Arrays.asList(10.2, 20.2);
		List<String> li2 = Arrays.asList("one", "two", "three");
		
		MyList15.printList(li);
		MyList15.printList(li2);
	}
}
