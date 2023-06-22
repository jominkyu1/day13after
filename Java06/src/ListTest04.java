import java.util.Enumeration;
import java.util.Vector;

//	Java.util패키지의 Enumeration (JDK1.0~)
//	- Iterator와 비슷함. Vector와 주로 사용
//	
public class ListTest04 {
	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>();
		
		vec.add(10);
		vec.add(20);
		vec.add(30);
		
		Enumeration en = vec.elements();
		
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
}
