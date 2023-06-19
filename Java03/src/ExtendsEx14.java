//부모클래스 생성자가 오버로딩이 된 경우 기본생성자는 묵시적 제공하지 않는다.
class ParentPoint14{
	protected int a=10;
	protected int b=20;
	
	public ParentPoint14() {
		super();
	}
	public ParentPoint14(int a, int b) {
		this.a=a;
		this.b=b;
	}
}

class ChildPoint14 extends ParentPoint14{
	protected int c=30;
	
	public ChildPoint14() {
		super();
	}
	
	public ChildPoint14(int a, int b, int c) {
		super();
	}
}

public class ExtendsEx14 {
	public static void main(String[] args) {
		
	}
}