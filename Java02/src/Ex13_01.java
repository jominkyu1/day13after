//문제 13장 생성자.pdf의 No.19
class Animal{
	private String name;
	private int age;
	
	 
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println(name+"는(은) "+age+"살 입니다.");
	}
}

public class Ex13_01 {
	public static void main(String[] args) {
		Animal a1 = new Animal("원숭이", 26);
		a1.show();
	}
}