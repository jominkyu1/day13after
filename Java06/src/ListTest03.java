import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*	java.util 패키지의 컬렉션 인터페이스 Iterator (JDK1.2~)
 * 	-저장하는 용도X 읽어 오는 용도로 사용, 주로 List, ArrayList와 사용
 * */
public class ListTest03 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add(100);
		list.add(200.6);
		list.add("홍길동");
		list.add(false);
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"  ");
		}
	}
}
