import java.util.Arrays;
import java.util.List;

public class ListTest13 {
	public static void addNum(List<? super Integer> t) {
		/*	<? super Integer>	Integer타입의 조상만 제네릭타입간의 형변환을 허용
		 * */
		int result=0;
		for(Object e : t) {
			result += (int) e;
			System.out.println(e);
		}
		
		System.out.printf("--\nresult: %d\n--\n", result);
	}
	public static void main(String[] args) {
		Number[] arr = {10, 20, 30};
		Object[] arr2 = {100, 200, 300};
		
		List<Number> li = Arrays.asList(arr);
		List<Object> li2 = Arrays.asList(arr2);
		
		ListTest13.addNum(li);
		ListTest13.addNum(li2);
		
		
	}
}
