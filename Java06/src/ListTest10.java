import java.util.HashMap;
import java.util.Map;

//Hashmap
public class ListTest10 {
	public static void main(String[] args) {
		Map<String, Integer> hmap = new HashMap<>();
		
		String[] sample = {"to","be", "for", "to", "to"};
		
		for(String str : sample) {
			Integer i = hmap.get(str);
			hmap.put(str, (i==null)?1:i+1);
		}
		
		
		System.out.println(hmap.size());
		System.out.println(hmap);
		
	}
}
