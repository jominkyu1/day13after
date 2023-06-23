import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class ListTest07 {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		HashMap hm = new HashMap();
		
		ht.put("apple", "사과");
		ht.put("banana", "바나나");
		ht.put("grape", "포도");
		
		String val = (String) ht.get("grape");
		
		if(val!=null) System.out.println("grape->"+val);
		
		Enumeration enn = ht.keys();
		
		while(enn.hasMoreElements()) {
			Object obj = enn.nextElement();
			System.out.print(obj);
			System.out.println("\t"+ht.get(obj));
		}
	}
}
