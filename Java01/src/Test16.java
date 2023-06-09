import java.util.Scanner;

//이중 반복문을 완전히 중단하기 위한 실습 예제
public class Test16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int menu=0;
		int num=0;

		outer_while:
			while(true) {
				System.out.println("1- 비빔밥");
				System.out.println("2- 고등어 자반");
				System.out.println("3- 오징어 볶음");
				System.out.print("원하는 메뉴 (0: 종료) >>> ");

				menu = sc.nextInt();

				if(menu==0) {System.out.println("종료"); break;}
				else if(menu<0 || menu>3) {System.out.println("잘못입력"); continue;}

				for(;;) { //for loop
					System.out.print("계산할 값 입력(0: 종료, 99: 전체종료) >>> ");

					num = sc.nextInt();

					if(num==0) break;
					else if(num==99) break outer_while;

					switch(menu) {
					case 1:
						System.out.println("비빔밥 값: " + num);
						break;
					case 2:
						System.out.println("고등어 자반 값: " + num*2);
						break;
					case 3:
						System.out.println("오징어 볶음 값: " + num*3);
						break;
					}

					//break outer_while;
					break;
				}
			}
	}
}
