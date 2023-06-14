/*	생성자는 메소드의 일종이기 때문에 오버로딩 가능
 * */
class MyDate05{
	private int year;
	private int month;
	private int day;
	
	public MyDate05() {
		this.year=2023;
		this.month=6;
		this.day=1;
	}
	
	public MyDate05(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void pr() {
		System.out.printf("%d년 %d월 %d일\n", year, month, day);
	}
}

public class ObjTest05 {
	public static void main(String[] args) {
		MyDate05 md = new MyDate05();
		md.pr();
		
		MyDate05 md2 = new MyDate05(2023, 6, 12);
		md2.pr();
	}
}