/* 매개변수(전달인자) 타입이 참조(레퍼런스) 자료형이면 참조주소를 전달함.
 * */
class MyDate11{
	int year=2022;
	int month=12;
	int day=31;
}

class 참조클래스{
	void changeDate(MyDate11 t) { //t에는 객체주소가 전달됨
		t.year=2023; t.month=6; t.day=12;
	}
}
public class Test11 {
	public static void main(String[] args) {
		참조클래스 rm = new 참조클래스();
		MyDate11 d = new MyDate11();
		
		System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
		rm.changeDate(d);//객체 주소 전달
		System.out.printf("changedate()호출 후 -> %d년 %d월 %d일\n", d.year, d.month, d.day);
	}
}
