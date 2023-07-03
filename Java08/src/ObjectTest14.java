//Stringbuffer

public class ObjectTest14 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		
		System.out.println(sb.equals(sb2)); //false, StringBuffer 클래스에는 equals 오버라이딩 안되어있음.

		System.out.println(ObjectTest14.stringEquals(sb, sb2));
		//혹은 .toString()
	}

	public static boolean stringEquals(CharSequence a, CharSequence b){
										//length() 인터페이스
		if(a.length()!=b.length()) return false;
		if(a==b) return true;
		
		for(int i=0; i<a.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}