//change()메소드 매개변수 타입이 기본자료형이기때문에 값만 전달받음
class Data12{
	int x;
}

class Value12{
	void change(int x) { //기본타입 매개변수 (값만 전달)
		System.out.println("original x= " + x); //100
		x=1000;
		System.out.println("changed x= " + x); //1000
	}
}
public class Test12 {
	public static void main(String[] args) {
		Data12 d = new Data12();
		d.x=100;
		System.out.println("change() 메소드 호출 전 d.x => " + d.x);
		
		Value12 v12 = new Value12();
		v12.change(d.x); //값만 전달
		System.out.println("change() 메소드 호출 후 d.x => " + d.x);
	}
}
