
public class ObjectTest12 {
	public static void main(String[] args) {
		String animals = "dog, cat, bear";
		String[] arr = animals.split(", ");
		
		for(String str : arr) System.out.print(str+" ");
		
		System.out.println("\n-----");
		
		String str = "java.lang.Object";
		String strSub = str.substring(str.indexOf("O"));
		System.out.println(strSub);
		
		String strSub2 = str.substring(str.indexOf("l"), str.length());
		System.out.println(strSub2);
	}
}
