// 생성자

class MyDate03{
	private int year = 2023;
	private int month = 6;
	private int date = 10;
	
	public MyDate03() {
		System.out.println("\n생성자: 객체가 생성될때 자동 호출");
	}
	
	public void print() {
		System.out.printf("\n%d년 %d월 %d일", year, month, date);
	}
}

public class ObjTest03 {
	public static void main(String[] args) {
		new MyDate03().print();
		
		MyDate03 m = new MyDate03();
		m.print();
	}
}