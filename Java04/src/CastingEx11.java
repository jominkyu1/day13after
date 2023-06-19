/*	형변환
 * */

class Mother11{
	public void m11() {
		System.out.println("부모클래스 m11() 메소드");
	}
}

class Child11 extends Mother11{
	public void ch11() {
		System.out.println("자손클래스 ch11() 메소드");
	}
}

public class CastingEx11 {
	public static void main(String[] args) {
		Child11 ch = new Child11();
		ch.m11();
		ch.ch11();
		
		System.out.println("--------");
		Mother11 m11 = new Child11();
		m11.m11();
		
		Mother11 m12;
		m12=ch;
		m12.m11();
		
		System.out.println(ch.hashCode());
		System.out.println(m12.hashCode());
		System.out.println(m11.hashCode());
	}
}
