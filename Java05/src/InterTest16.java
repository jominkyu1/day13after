//클래스간 직접연결을 다루는 예제
class A16{
	public void methodA(B16 b) {
		b.methodB();
	}
}

class B16{
	public void methodB() {
		System.out.println("methodB()");
	}
}

public class InterTest16 {
	public static void main(String[] args) {
		A16 a16 = new A16();
		a16.methodA(new B16());
		
		
	}
}