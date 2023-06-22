interface MyInter18{
	public default void method01() { 
		System.out.println("method01() in MyInter");
	}

	default void method02() {//public 생략가능
		System.out.println("method02() in MyInter");
	}

	public static void staticMethod() {
		System.out.println("staticMethod() in MyInter");
	}
}

interface MyInter18_01 {
	default void method01() {
		System.out.println("method01() in MyInter_01");
	}
}

class Parent18{

	public void method02() {
		System.out.println("method02() in Parent");
	}
}

class Child18 extends Parent18 implements MyInter18, MyInter18_01{
	//다중상속받은 인터페이스들의 디폴트메소드가 겹칠경우 오버라이딩 해야함
	@Override
	public void method01() {
		System.out.println("method01() Override in Child");
	}
}

public class InterTest18{
	public static void main(String[] args) {
		Child18 c18 = new Child18();
		c18.method01();
		c18.method02(); //Parent18에서 오버라이딩된 메소드 호출
		MyInter18.staticMethod(); //인터페이스 static 메소드
	}
}