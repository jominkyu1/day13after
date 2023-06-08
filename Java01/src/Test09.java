/* 참조타입 변수가 같은 객체주소를 가진 경우와 그렇지 아니한 경우에 관한 소스
 */
class MyDate09{
	int year=2023;
	int month=5;
	int day=31;
}

public class Test09 {
	public static void main(String[] args) {
		MyDate09 d = new MyDate09();
		MyDate09 t = d; // d가 참조하는 객체주소가 t에 대입됨 (동일한 객체를 참조)
		
		System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
		System.out.printf("%d년 %d월 %d일\n", t.year, t.month, t.day);
		System.out.println("============");
		
		/* 문제) t변수에 새로운 객체를 생성한 후 year, month, day변수에 2023, 6, 12 저장
		 * 이후 t, d 둘다 year, month, day변수 출력
		 * */
		
		t = new MyDate09();
		
		t.year=2023; 
		t.month=6;
		t.day=12;
		
		System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
		System.out.printf("%d년 %d월 %d일\n", t.year, t.month, t.day);
		System.out.println("============");
		
		/* 문제) t객체주소를 d에 대입해서 t, d로 접근한 year, month, day를 2023년 6월 12일로 주소값을 공유해서
		 * 같은 값이 출력되게 만들어보기
		 * */
		
		d=t;
		
		System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
		System.out.printf("%d년 %d월 %d일\n", t.year, t.month, t.day);
		System.out.println("============");
	}
}
