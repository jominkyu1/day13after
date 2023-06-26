import java.io.PrintWriter;
import java.util.ArrayList;


// AutoCloseable인터페이스를 구현 상속받은 자손클래스는 try()내에서 객체를 생성하면
// 자동으로 닫힘 (JDK 1.7~)

public class TryAuto {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("A");
		arr.add("B");
		arr.add("C");
		
		try(PrintWriter output = new PrintWriter("out.txt")){ //Project 경로
			//	java.io 입출력패키지의 PrintWriter 출력스트림은 AutoCloseable 상속받음
			 arr.forEach(output::append);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
