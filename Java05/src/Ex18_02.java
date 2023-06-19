// 문제) 18장. 추상클래스와 final.pdf의 No.21페이지문제

class A02{
	public final int m01() {
		return 0;
	}
}

class B02 extends A02{
	@Override
	public final int m01() {
		return 1;
	}
}
public class Ex18_02 {
	public static void main(String[] args) {
		
	}
}