import java.util.ArrayList;
/*	java.util패키지의 List
 * */
public class ListTest02 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList<>();
		arr.add("a");
		arr.add(512);
		arr.add(false);
		arr.add(511.11);
		
		for(Object o : arr) {
			System.out.println(o);
		}
	}
}