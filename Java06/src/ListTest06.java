import java.util.Stack;

// java.util패키지의 컬렉션 클래스 Stack의 특징
// - 입구와 출구가 같음(Last Input First Output, LIFO)

public class ListTest06 {
	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		
		st.push("1- java");
		st.push("2- oracle");
		st.push("3- client");
		
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		
		st.push("1- java");
		st.push("2- oracle");
		st.push("3- client");
		
		while(!st.isEmpty()) {
			System.out.print(st.pop()+", ");
		}
	}
}
