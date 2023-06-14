//super keyword

class Parent11{
	int x, y;
	
	public void pr(int x) {
		this.x=x;
		System.out.println(x);
	}
	
	public void pr(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+","+y);
	}
}

class Child11 extends Parent11{
	int c;
	
	@Override
	public void pr(int x) {
		super.pr(x, 20);
	}
	
	@Override
	public void pr(int x, int y) {
		System.out.println("NULL");
	}
}

public class ExtendsEx11{
	public static void main(String[] args) {
		Child11 ch11 = new Child11();
		
		ch11.pr(10);
		ch11.pr(11, 10);
	}
}
