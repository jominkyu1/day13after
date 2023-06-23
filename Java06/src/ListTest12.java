import java.util.ArrayList;
import java.util.List;

//제네릭 타입간의 형변환 불가능. 그래서 나온 문법이 제네릭 와일드카드

public class ListTest12 {
	public static void main(String[] args) {
		ArrayList<String> strArr = new ArrayList<>();
		 
		strArr.add("apple");
		strArr.add("grape");
		
//		ArrayList<Object> objArr = strArr; 형변환 불가능 
		
		//////////////////////////제네릭 형변환
		
		ArrayList<String> cityArr = new ArrayList<>();
		cityArr.add("seoul");
		cityArr.add("incheon");
		cityArr.add("busan");
		
		ArrayList<? extends Object> objList;
		
		/* <? extends Object> 	제네릭 타입 형변환 와일드카드 문법형식
		 * 						Object을 상속받은 자손은 제네릭 타입간의 형변환을 허용하겠다는 의미.
		 * */
		
		objList = cityArr;
		
		for(Object obj : objList) {
			String str = (String) obj;
			System.out.println(str);
		}
	}
}
