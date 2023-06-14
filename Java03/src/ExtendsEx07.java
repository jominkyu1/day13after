//클래스 상속 
class Parent07 extends Object{ //최상위클래스 Object
	public void prn() {
		System.out.println("부모클래스 prn()");
	}
}

public class ExtendsEx07 extends Parent07{
	public void prn() {
		System.out.println("자식클래스 prn2()");
	}
	
	public static void main(String[] args) {
		ExtendsEx07 ext = new ExtendsEx07();
		ext.prn();
		
		Parent07 parent = new Parent07();
		parent.prn();
		
		ExtendsEx07 parent2 = (ExtendsEx07) parent;
		
		parent2.prn();
	}
}