import java.util.HashSet;
import java.util.Set;

/*	java.util 패키지의 컬렉션 Set인터페이스 특징
 * - 복수개의 자료형 타입을 동시 저장가능
 * - 저장되는 순서 보장하지않음
 * - 중복X
 * */
public class ListTest01 {
	public static void main(String[] args) {
		Set nameSet = new HashSet();
		nameSet.add(100);
		nameSet.add("홍길동");
		nameSet.add("홍길동");
		nameSet.add(100.5);
		nameSet.add('A');
		
		System.out.println("size:" + nameSet.size());
		System.out.println(nameSet);
	}
}