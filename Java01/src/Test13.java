
class Data13{
	int a; //클래스 멤버변수는 0으로 자동 초기화됨
}

class Value13{
	public void change(Data13 d) { //참조타입 or 레퍼런스타입(객체의 주소값을 전달받음)
		d.a = 1000;
	}
}

public class Test13 {
	public static void main(String[] args) {
		Value13 v13 = new Value13();
		Data13 t = new Data13();
		
		t.a=100;
		System.out.println("original t.a = " + t.a);
		
		v13.change(t); //객체주소 전달
		
		System.out.println("change() 메소드 호출 후 t.a = " + t.a);
	}
}
