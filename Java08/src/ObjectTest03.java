class Point02 extends Object{
	int x,y;

	public Point02() {}
	public Point02(int x, int y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Point02)) return false;
		Point02 tmp = (Point02) obj;

		return (tmp.x==x && tmp.y==y);
	}
}
public class ObjectTest03 {
	public static void main(String[] args) {
		Point02 pt01 = new Point02(100,200);
		Point02 pt02 = new Point02(100,200);

		System.out.println(pt01==pt02);
		System.out.println(pt01.equals(pt02));
	}
}
