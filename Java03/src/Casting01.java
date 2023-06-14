import java.util.Scanner;

class NameBook01{
	private String name, number;

	public NameBook01(String name, String number) {
		this.name=name;
		this.number=number;
	}
	public String pr() {
		return (name+","+number);
	}
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
}
public class Casting01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//NameBook01 nb = new NameBook01();

		System.out.print("Size: ");
		final int MAX = sc.nextInt();

		NameBook01[] nbArr = new NameBook01[MAX]; 

		for(int i=0; i<MAX; i++) {
			System.out.print("이름: ");
			String name = sc.next();
			if(name.contentEquals("-1")) return;
			System.out.print("번호: ");
			String number = sc.next();

			nbArr[i] = new NameBook01(name, number);
		}

		System.out.println("===========");
		for(int i=0; i<nbArr.length; i++) {
			System.out.println(nbArr[i].pr());
		}

		System.out.println("===========");
		System.out.print("찾을 이름: ");
		String findName = sc.next();

		for(int i=0; i<nbArr.length;i++) {
			if(findName.equals(nbArr[i].getName())) {
				System.out.println(nbArr[i].getNumber());
				return;
			}
		}
		System.out.println("없는 이름");
	}
}
