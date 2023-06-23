import java.util.ArrayList;
import java.util.List;

public class ListTest09 {
	public static void main(String[] args) {
		List<String> arr = new ArrayList<String>();
		
		
		arr.add("H");
		arr.add("A");
		arr.add("P");
		arr.add("P");
		arr.add("Y");
		
		for(String str:arr) System.out.print(str.toLowerCase());
	}
}