class Member01{
	/* 1. class 키워드로 클래스명 Member01을 정의
	 * 2. 클래스명 첫글자는 관례적으로 영문대문자로 한다.
	 */
	String name;
	int age;
}
class b{
	String name;
	int age;
	
	public b(String name, int age) {
		System.out.println("이름:"+name+", 나이:"+age);
	}
}
class Thing{
	int x;
}
public class Test01 {
	public static void main(String[] args) {
		Member01 mem = new Member01();
		new b("펭귄", 12);
		Thing t = new Thing();
		
		mem.name="홍길동";
		mem.age=33;
		
		System.out.println("이름:"+mem.name);
		System.out.println("나이:"+mem.age);
		
		System.out.println(t.x=10);
	}
}