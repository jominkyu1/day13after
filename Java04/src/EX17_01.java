abstract class AbClass{
	int i=10;
	abstract public void pr();
}

class SubClass17 extends AbClass{
	int i=3;

	public void pr() {System.out.println("pr()");}
	public void pr2() {System.out.println("pr2()");}
}

public class EX17_01 {
	public static void main(String[] args) {
		Object obj = new SubClass17();

		if(obj instanceof SubClass17) {
			SubClass17 sc17 = (SubClass17) obj;
			System.out.println("i=" + sc17.i);

			if(sc17 instanceof AbClass) {
				AbClass abc = (AbClass) sc17;
				System.out.println("i=" + abc.i);
				abc.pr();
			}
		}
	}
}