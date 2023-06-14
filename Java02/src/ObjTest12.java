import java.util.ArrayList;

public class ObjTest12 {
	public static ArrayList<Integer> result = new ArrayList<Integer>();
	
	static {
		for(int i=0; i<10; i++) {
			result.add((int)(Math.random()*10+1)); // 0.0이상 1.0미만 *10 + 1
		}
	}//클래스 초기화 블록
	
	public static void main(String[] args) {
		System.out.println(ObjTest12.result);
	}
}