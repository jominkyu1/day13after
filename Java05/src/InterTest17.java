/*	클래스간 연결을 인터페이스를 통하여 간접연결하는 예제
 * */
interface I17{
	public abstract void play();
}

class A17{
	public void autoPlay(I17 i) {
		i.play();
	}
}

class B17 implements I17{

	@Override
	public void play() {
		System.out.println("B17 play() method");
	}
}

class C17 implements I17{

	@Override
	public void play() {
		System.out.println("C17 play() method");
	}
}
public class InterTest17 {
	public static void main(String[] args) {
		A17 a17 = new A17();
		a17.autoPlay(new B17());
		a17.autoPlay(new C17());
	}
}