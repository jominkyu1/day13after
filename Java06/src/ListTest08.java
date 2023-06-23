import java.util.ArrayList;

//제네릭 사용
public class ListTest08 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		arr.add("seoul");
		arr.add("busan");
		arr.add("suwon");
		
		String str = (String) arr.get(0); //다운캐스팅
	}
}