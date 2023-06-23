// 복수 catch{}블록을 사용한 경우
/*	try{
 * 	정상구문
 * 	}catch(자손클래스){
 * 	예외처리
 * 	}catch(부모클래스){
 * 	예외처리
 * 	}
 * */
public class TryTest02 {

	public static void main(String[] args) {
		int a=10, b01=0, b02=2, result=0;
		
		try {
			result=a/b02;
			System.out.println(result);
			
			result=a/b01; // 0으로 나눌경우 ArithmeticException 발생
		}catch(ArithmeticException e) { //구체적인 예외처리 자손클래스가 먼저
			e.printStackTrace();
		}catch(Exception e) { //예외처리 부모클래스를 나중에 기술
			e.printStackTrace();
		}
		System.out.println("AA");
	}
}