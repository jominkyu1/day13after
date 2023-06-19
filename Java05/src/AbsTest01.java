//추상클래스 
abstract class Abs01{
	public void pr() {System.out.println("AA");}

	static void pr2() {System.out.println("AABB");}

	abstract void pr3();
}

class Abs01Sub extends Abs01{
	void pr3(){
		System.out.println("pr3");
	}
}
public class AbsTest01 {
	public static void main(String[] args) {
		Abs01 abs = new Abs01Sub();
		
		abs.pr3();
	}
}