class Parent13{
	protected int x, y;
	
	public Parent13() {
		System.out.println("Parent13 기본생성자");
	} 
	
	public Parent13(int x, int y) {
		this.x=x;
		this.y=y;
	}
}

class Child13 extends Parent13{
	protected int z;
	
	public Child13() {
		super();//생략가능
		System.out.println("Child13 기본생성자");
	}
	
	public Child13(int x, int y, int z) {
		super(x,y);
		this.z=z;
	}
}
public class ExtendsEx13 {
	public static void main(String[] args) {
		Child13 ch13 = new Child13(1,2,3);
		Child13 ch13_1 = new Child13();
	}
}