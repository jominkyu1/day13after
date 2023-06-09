public class Test15 {
	public static void main(String[] args) {
		int i=0;
		int a=0;

		for(a=1;a<=5;a++) {
			System.out.println("a-> " + a);
			for(i=1;i<=5;i++) {
				if(i%3==0) break;
				System.out.println("i => " + i);
			}
		}
		System.out.println("==============");

		exit_for: //임이의 label
			for(a=1;a<=3;a++) {
				System.out.println("a-> " + a);
				for(i=1;i<=3;i++) {
					if(i%3==0) break exit_for; //label 빠져나옴
					System.out.println("i => " + i);
				}
			}
	}
}