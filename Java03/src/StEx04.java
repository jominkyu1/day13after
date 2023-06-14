// 정적메서드 내에서 인스턴스 변수를 사용할 수 없다.
class St04{
	private static int a=100; //정적변수(클래스변수)
	private int b=200;
	
	public static void print() {
		System.out.println(a);
		//System.out.println(b); error
	}
}

public class StEx04{
	public static void main(String[] args) {
		
	}
}