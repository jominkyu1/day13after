/*	int ...arr은 JDK1.5에서 추가된 가변인자 문법 (Variable Argument List)
 * 
 * 	추가된 이유 
 * 	전달인자 개수가 다른 메소드가 오버로딩이 된 경우 들어올 개수만큼 메소드를 오버로딩해야함. (중복코드 발생, OOP의 방향성과 맞지않음)
 * 	
 */
class Mt07{
	void prn(int ...arr) {
		for(int i : arr) {
			System.out.print(i+"\t");
		}
		System.out.println("\n====\n");
	}
}

public class Test07 {
	public static void main(String[] args) {
		Mt07 mt = new Mt07();
		mt.prn(100, 200, 300, 400);
		mt.prn(100, 200, 300);
		mt.prn(100, 200);
		mt.prn(100);
	
	}
}