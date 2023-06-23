import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

//	java.util.ListIterator 인터페이스 JDK 1.2~
//	- Iterator 인터페이스를 상속받아 기능확장시킨 인터페이스
//	- Iterator에비해 양방향 이동가능
//	- List 인터페이스의 자손만 사용가능


public class ListTest16 {
	public static void main(String[] args) {
		List<String> arr = new ArrayList<>();
		arr.add("1");
		arr.add("2");
		arr.add("3");
		arr.add("4");
		arr.add("5");
		
		ListIterator<String> lArr = arr.listIterator();
		
		while(lArr.hasNext()) System.out.print(lArr.next()+" ");
		
		System.out.println("\n---");
		
		while(lArr.hasPrevious()) {
			String temp = lArr.previous();
			if (temp.equals("3")) continue;
			System.out.print(temp+" ");
		}
		
		System.out.println("\n---");
		
	}
}