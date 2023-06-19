//m2를 명시적인 다운캐스팅을 한 다음 자손에서 정의한 메소드와 오버라이딩한 메소드를 각각 호출하라
class Mother16{
	public void m16() {System.out.println("부모 m16() 메소드");}
}

class Child166 extends Mother16{
	public void c16() {System.out.println("자식 c16() 메소드");}

	@Override
	public void m16() {
		System.out.println("오버라이딩한 m16() 메소드");
	}
}

public class CastingEx16 {
	public static void main(String[] args) {
		Mother16 m16 = new Child166();

		if(m16 instanceof Child166) {
			Child166 c166 = (Child166) m16;
			c166.c16();
			c166.m16();
		}
	}
}
