class St03{
	private static int a=10;
	private int b=20;
	
	public static void printA() {
		System.out.println(a);
		// System.out.println(this.a); 컴파일에러
	}
	
	public void printB() {
		System.out.println(a);
		System.out.println(this.a);
	}
}

public class StEx03 {
	public static void main(String[] args) {
		
	}
}
