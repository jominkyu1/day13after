/* 매개변수(전달인자) 타입이 기본자료형인 경우 값만 전달됨 (주소를 공유하지 않음)
 * */
class Vm10{
	void change(int y) { //y 매개변수에 값만 전달됨
		y=10;
	}
}

public class Test10 {
	public static void main(String[] args) {
		Vm10 v = new Vm10();
		int x=7;
		
		System.out.println("change()메소드 호출전의 x값: "+x);
		v.change(x); //값만 전달(주소 공유X)
		System.out.println("change()메소드 호출후의 x값: "+x);
		
	}
}
