class A2 {
	public String toString() {
		return "4";
	}
}

class B2 extends A2{

	@Override
	public String toString() {
		return super.toString() + "3";
	}//메소드 오버라이딩
	
}
public class SubEx09 {
	public static void main(String[] args) {
		
		System.out.println(new B2().toString());
		System.out.println(new B2());
	}
}