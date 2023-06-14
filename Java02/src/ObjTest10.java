class MyDate10{
	// 클래스 소속의 멤버 변수의 각 타입에 따른 기본값
	// String, 참조타입 = null
	// int, short, int = 0
	// long = 0L
	// float = 0.0f
	// double = 0.0 or 0.0d
	// boolean = false
	
	private int year;
	private int month;
	private int date;
	
	public MyDate10() {
		this(2023,2,1);
	}
	public MyDate10(int year, int month) {
		this(year,month,10);
	}
	public MyDate10(int year, int month, int date) {
		this.year=year;
		this.month=month;
		this.date=date;
	}
	
	public void pr() {
		System.out.println(year+"년");
		System.out.println(month+"월");
		System.out.println(date+"일");
	}
}
public class ObjTest10 {
	public static void main(String[] args) {
		MyDate10 md = new MyDate10();
		
		md.pr();
		
		MyDate10 md2 = new MyDate10(2023,3);
		
		md2.pr();
		
		MyDate10 md3 = new MyDate10(2023, 6, 10);
		
		md3.pr();
	}
}