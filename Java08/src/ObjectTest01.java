/*	java.lang 패키지의 최고 조상 클래스 Object의 toString()메소드 오버라이딩
 * */

class Point01 extends Object{
	int x, y;
	
	@Override
	public String toString() {
		return String.valueOf(x+y);
	}
	
	public Point01() {}
	public Point01(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
}
public class ObjectTest01 {
	public static void main(String[] args) {
		Point01 pt01 = new Point01(10, 20);
		
		System.out.println(pt01.toString());
		System.out.println(pt01);
	}
}
