import java.util.Scanner;

/* Method Overloading 
 * 같은 클래스내에 동일 메소드명을 여러번 중복해서 정의하는것을 메소드 오버로딩이라 한다.
 * 
 * 구분요건
 *  가. 전달인자 자료형을 다르게 한다.
 *  나. 전달인자 개수를 다르게 한다.
 *  다. 전달인자 순서를 다르게 한다.
 * */

class Mt04{
	int abs(int data) {
		if(data<0) data=-data;

		return data;
	}
	
	double abs(double data) {
		if (data<0) data=-data;

		return data;
	}
}
public class Test04 {

	public static void main(String[] args) {
		Mt04 mt = new Mt04();

		int result = mt.abs(-100);
		System.out.println("-100의 절댓값: "+result);

		//Scanner를 사용하여 음의 실수값(double)을 입력받은 다음 해당값의 절대값출력 

		Scanner sc = new Scanner(System.in); 
		/* System.in은 키보드 입력장치와 연결
		 * */
		System.out.print("음의 실수값 입력: ");
		double d = sc.nextDouble();

		System.out.println("절댓값: " + mt.abs(d));
		sc.close();
		
	}
}
