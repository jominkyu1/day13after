/*	문제) 18장 추상클래스와 final.pdf No.19페이지 1번문제
 * */
abstract class Abs18_01{
	int a=10;
	String str="Test";
	public abstract int getA();
	public String getStr() {
		return str;
	}
}

abstract class Abs18_02 extends Abs18_01{
	int b=100;
	public abstract int getB();
}

class AbsMain18_02 extends Abs18_02{

	@Override
	public int getB() {
		return b;
	}

	@Override
	public int getA() {
		return a;
	}
}

public class Ex18_01{
	public static void main(String[] args) {
		AbsMain18_02 am = new AbsMain18_02();
		
		System.out.println(am.getA());
		System.out.println(am.getB());
	}
}