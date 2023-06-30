// Stringbuffer
public class ObjectTest06 {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer();
		
		str.append("Java");
		System.out.println(str);
		str.append(" Programming");
		System.out.println(str);
		
		str.replace(0, 4, "Jawa");
		System.out.println(str);
		
		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 8));
		
		System.out.println(str.reverse());
		System.out.println(str.deleteCharAt(0));
		System.out.println(str.reverse());
		
		System.out.println(str);
		
				
	}
}
