class Mother13{
	void m13() {
		System.out.println("부모클래스 m13()");
	}
}
class Child13 extends Mother13{
	void ch13() {
		System.out.println("자손클래스 ch13()");
	}
}

public class CastingEx13 {
	public static void main(String[] args) {
		//문제) 한줄로 업캐스팅을해서 메소드를 호출해보고 명시적인 형변환을 해서 다운캐스팅을 한 다음 메소드 호출
		
		Mother13 mother = (Mother13) new Child13();
		mother.m13();
		
		Child13 child = (Child13) mother;
		child.ch13();
		child.m13();
	}
}