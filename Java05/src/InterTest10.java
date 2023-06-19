/*	인터페이스
 * 	public static final (변수) 생략가능
 * 	public abstract (메소드) 생략가능
 * */

interface IHello10{
	public abstract void sayHello(String name); // public abstract 생략가능

	default void pr() {
		System.out.println("pr()");
	}
	public static void pr2() {
		System.out.println("pr2()");
	}
}
class Hello10 implements IHello10{

	@Override
	public void sayHello(String name) {
		System.out.println(name+"씨 안녕하세요.");
	}
	
}
public class InterTest10 {
	public static void main(String[] args) {
		IHello10.pr2();
		
		IHello10 hel = new Hello10();
		hel.sayHello("홍길동");
		
		Hello10 hel2 = new Hello10();
		hel2.sayHello("이순신");
		hel2.pr();
	}
}