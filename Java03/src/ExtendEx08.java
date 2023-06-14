//클래스 상속
class Point08{ //extends Object 생략
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}

class ChildPoint08 extends Point08{
	private int z;
	
	public int getZ() {
		return this.z;
	}
	public void setZ(int z) {
		this.z = z;
	}
}

public class ExtendEx08 {
	public static void main(String[] args) {
		ChildPoint08 child08 = new ChildPoint08();
		
		child08.setX(10);
		child08.setY(20);
		child08.setZ(30);
	}
}