
class Mother12{
	void m12() {
		System.out.println("부모 m12() 메소드");
	}
}

class Child12 extends Mother12{
	void ch12() {
		System.out.println("자식 ch12() 메소드");
	}
}
public class CastingEx12 {
	public static void main(String[] args) {
		Mother12 m12 = new Child12();
		
		Child12 ch12 = (Child12) m12; //명시적 형변환
		
	}
}
