//제네릭 클래스 설계

class GenericClass<T>{ //JDK 1.7~
	private T member;
	
	public T getMember() {

		return member;
	}

	public void setMember(T member) {
		this.member = member;
	}
}
public class ListTest11 {
	public static void main(String[] args) {
		GenericClass<Double> obj01 = new GenericClass<>();
		obj01.setMember(12.345);
		System.out.println("반환된 실수: " + obj01.getMember());
		
		GenericClass<String> obj02 = new GenericClass<>();
		obj02.setMember("홍길동");
		System.out.println("반환된 문자열: " + obj02.getMember());
	}
}
