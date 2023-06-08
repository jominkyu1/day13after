/* 문제)11장. 클래스와 객체.pdf의 No.13
 */
class Thing1{
	private int x;

	public int getX() {
		return x;//return 키워드(예약어)
	}

	public void setX(int x) {
		this.x = x;
	}
	
}
public class ThingTest01 {
	public static void main(String[] args) {
		Thing1 Thing1 = new Thing1();
		
		Thing1.setX(10);
		int a = Thing1.getX();
		
		System.out.println(a);
	}
}