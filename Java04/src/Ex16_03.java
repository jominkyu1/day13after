import java.util.List;

class Animal16{
	protected String kind;
	protected int leg;

	public Animal16() {}
	public Animal16(String kind, int leg) {
		this.kind=kind;
		this.leg=leg;
	}

	public void getKind() {
		if(kind.equals("강아지")) {
			System.out.println(kind+"동물이다.");
		}
		else{
			System.out.println(kind+"사람이다.");
		}
	}
	public void walk() {
		if(leg==4) {
			System.out.println(kind+"는4발로 걷는다.");
		}
		else {
			System.out.println(kind+"는2발로 걷는다.");
		}
	}
}

class Dog16 extends Animal16{
	public Dog16() {}
	public Dog16(String kind, int leg) {
		super(kind, leg);
	}
}
class Human16 extends Animal16{
	public Human16() {}
	public Human16(String kind, int leg) {
		super(kind, leg);
	}
}

public class Ex16_03 {
	public static void main(String[] args) {
		Dog16 d = new Dog16("강아지", 4);
		Human16 h = new Human16("소녀", 2);

		d.getKind();
		d.walk();

		h.getKind();
		h.walk();
	}
}
