class Parent16{
	private int a, b;
	protected int c;
	public int d;
	
	public int getA() {
			return a;
	}
	public void setA(int a) {
			this.a = a;
	}
	public int getB() {
			return b;
	}
	public void setB(int b) {
			this.b = b;
	}
}

class Child16 extends Parent16{
	public Child16(int a, int b, int c, int d) {
		setA(a);
		setB(b);
		this.c=c;
		this.d=d;
	}
	
	void func() {
		System.out.println(getA());
		System.out.println(getB());
		System.out.println(c);
		System.out.println(d);
	}
}

public class Ex16_2 {
	public static void main(String[] args) {
		Child16 one = new Child16(1,2,3,4);
		one.func();
	}
}