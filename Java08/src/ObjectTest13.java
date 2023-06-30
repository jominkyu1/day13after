/*	String class 내장 메소드를 활용하여 파일명과 확장자를 구하기
 * */

public class ObjectTest13{
	public static void main(String[] args) throws Exception, Error{
		String fullName = "Hello.java";
		
		int index = fullName.indexOf('.');
		
		System.out.println("파일명: " + fullName.substring(0, index));
		System.out.println("확장자명: " + fullName.substring(index+1));
		
		
		System.out.println(fullName.contains("hELLo"));
		System.out.println(fullName.toLowerCase().contains("hELLo".toLowerCase()));
		
	}
}