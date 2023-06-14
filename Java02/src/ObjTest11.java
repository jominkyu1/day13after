// 클래스 초기화블록과 인스턴스 초기화 블록

public class ObjTest11 {
	public ObjTest11() {
		System.out.println("기본 생성자");
	} //기본생성자보다 인스턴스 초기화 블록이 먼저 생성됨
	
	static {
		System.out.println("static{}");
	}
	// static()을 클래스 초기화 블록이라고한다. 클래스 초기화 블록은 정적변수 즉 클래스변수 초기화에 사용된다.
	// static키워드로 정의된 변수를 정적변수 즉 클래스 변수라고 한다.
	// 정적 변수는 객체 생성없이 클래스로 직접 접근가능하다.
	// 클래스 초기화 블록은 해당 클래스가 최초 로딩될 때 딱 한번만 수행된다.
	
	{
		System.out.println("인스턴스 초기화 블록");
	}
	// {} 인스턴스 초기화블록은 인스턴스 변수 초기화에 사용된다.
	// 인스턴스 초기화 블록은 객체가 생성될때마다 수행되고, 생성자보다 먼저 호출한다.
	

	public static void main(String[] args) {
		new ObjTest11();
		new ObjTest11(); // static은 1회만 실행됨
		
		
	}
}