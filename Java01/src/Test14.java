// 비트 연산자
public class Test14 {
	public static void main(String[] args) {
		int a=12;// 01100
		int b=20;// 10100
		
		int result=0; 
		
		result = a|b; //or
		System.out.println(result);
		
		result = a&b; //and
		System.out.println(result);
		
		result = a^b; //XOR
		System.out.println(result);
		System.out.println("======");
		
		System.out.println(~a); //비트반
		
		byte x=15;
		System.out.println(x<<2);
		System.out.println(x>>2);
	}
}