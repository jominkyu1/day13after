/*	String 클래스
 * */

class Str1{
	String str="BB";
	

	
	public Str1 setStr(String str) {
		this.str=str;
		return this;
	}
	
	public void pr() {
		System.out.println("pr()");
		System.out.println(str);
	}
	
}
public class ObJectTest02 {
	public static void main(String[] args) {
		int a=10, b=10;
		
		String str="10";
		String str2 = new String("10");
		
		System.out.println(a==b);
		
		System.out.println(str==str2);
		System.out.println(str.equals(str2));
		
		System.out.println(str.toString());
		System.out.println(str2.toString());
		
		Str1 ss = new Str1().setStr("AA");
		ss.pr();
	}
}
