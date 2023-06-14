// static변수 -> 클래스변수, 사용시 클래스로 직접 접근
class StaticTest01{
	static int a =10;
	int b =20;
}
public class StEx01 {
	public static void main(String[] args) {
		System.out.println("StaticTest01.a -> " + StaticTest01.a);
		
		StaticTest01 s1 = new StaticTest01();
		StaticTest01 s2 = new StaticTest01();
		
		System.out.printf("\ns1.a ->%d\t s2.a -> %d", s1.a, s2.a);
		System.out.printf("\ns1.b ->%d\t s2.b -> %d", s1.b, s2.b);
		
		s1.a=100;
		s1.b=200;
		
		System.out.printf("\n\ns1.a ->%d\t s2.a -> %d", s1.a, s2.a);
		System.out.printf("\ns1.b ->%d\t s2.b -> %d", s1.b, s2.b);
		
	}
}