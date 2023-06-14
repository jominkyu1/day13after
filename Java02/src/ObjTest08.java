// this키워드를 사용해야 하는 이유
// 클래스 소속의 멤버변수 중 인스턴스 변수(속성)와 메서드 소속의 매개변수(전달 인자) 이름이 같은 경우 구분짓기 위해
class MyDate08{
	private int year;
	private int month;
	private int date;
	
	public MyDate08() {
		
	}
	
	public MyDate08(int year, int month, int date) {
		//this.year=year;
		
		year=year; //저장안됨
		this.month=month;
		this.date=date;
	}
	
	public void pr() {
		System.out.println(year+"년"+month+"월"+date+"일");
	}
}
public class ObjTest08 {
	public static void main(String[] args) {
		MyDate08 md = new MyDate08(2023, 6, 12);
		
		md.pr();
	}
}
