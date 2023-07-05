// String 클래스의 내장 메소드

public class ObjectTest11 {
	public static void main(String[] args) {
		String str = "Hello";
		
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.toUpperCase().charAt(i)+" ");
		}
		
		char[] chArr = {'~', 'j', 'a', 'v', 'a'};
		
		String str2 = String.copyValueOf(chArr);
		
		char[] chArr2 = str2.toUpperCase().toCharArray();
		
		for(char ch : chArr2) {
			System.out.print(ch+" ");
		}
		
		String str3 = str2.replace('a', 'A');
		
		System.out.println("\n"+str3);
		
	}
}
