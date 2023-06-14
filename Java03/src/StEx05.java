import java.util.Scanner;

// 내장 api클래스 하위의 내장메소드를 활용하는 예제

public class StEx05 {
	public static void main(String[] args) {
		//문제) Math의 정적 메소드를 활용하여 입력받은 두 정수의 최대값, 최소값 구하기 (Scanner사용)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. 입력: ");
		int a = sc.nextInt();
		System.out.print("2. 입력: ");
		int b = sc.nextInt();
		
		System.out.println(Math.max(a, b));
		System.out.println(Math.min(a, b));
	}
}