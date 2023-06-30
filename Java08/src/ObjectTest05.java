
public class ObjectTest05 {
	public static void main(String[] args) {
		String str = "ABC";
		
		System.out.println(str.hashCode());
		
		str = "ABCD";
		
		System.out.println(str.hashCode());
		
		str = "ABCDEFG";
		
		System.out.println(str.hashCode());
		
		System.out.println("==================");
		System.out.println(str.charAt(3));
		System.out.println(str.indexOf("C"));
		
		System.out.println(str.lastIndexOf("E")+1);
		
		
		
	}
}
