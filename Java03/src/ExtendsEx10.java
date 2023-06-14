//메소드 오버라이딩

class Parent10{ 
	int i=0;
	public void p10() {
		System.out.println("부모클래스의 p10() 메소드");
	}
}

class Child10 extends Parent10{
	int i=10;
	@Override
	public void p10() {
		System.out.println("오버라이딩한 p10() 메소드");
	}
	
	public void ch10() {
		System.out.println("자식클래스의 ch10() 메소드");
	}
	public void prt() {
		super.p10();
	}
}

public class ExtendsEx10 {
	public static void main(String[] args) {
		Parent10 pa10 = new Parent10();
		Child10 ch10 = new Child10();
		
		pa10.p10();
		ch10.p10();
		
		Parent10 pa11 = (Parent10) ch10;
		
		System.out.println(pa11.hashCode());
		System.out.println(ch10.hashCode());
		
		pa11.p10();
		
		System.out.println(ch10.i);
		ch10.prt();
	}
}