//기본 자료형과 참조(레퍼런스) 자료형의 차이점

class MyDate08{
	int year = 2022;
	int month = 6;
	int day = 1;
}

public class Test08 {

	public static void main(String[] args) {
		int x=7;
		int y=x; //값7이 저장 (참조가 다름)
		
		MyDate08 d = new MyDate08();
		MyDate08 t = d; //t와 d가 같은 객체를 참조 (참조가 같음)
		
		System.out.println("X -> " + x + "\nY -> " + y);
		
		System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
		System.out.printf("%d년 %d월 %d일", t.year, t.month, t.day);
		System.out.println("\n==================\n");
		
		x=10;
		
		System.out.printf("X -> %d \nY -> %d\n", x, y);
		
		d.year=2023; d.month=6; d.day=8; //참조가같기때문에 참조변수 t와 d의 값 모두 바뀜
		
		System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
		System.out.printf("%d년 %d월 %d일", t.year, t.month, t.day);
	}
}
