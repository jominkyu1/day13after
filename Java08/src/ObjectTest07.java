import java.util.StringTokenizer;

//java util패키지의 StringTokenizer

//특수문자 기호를 기준으로 문자를 분리(파싱) 해준다. 분리된 문자를 파싱된 문자라고 한다.
public class ObjectTest07 {
	public static void main(String[] args) {
		String phone = "010-1234-5678";
		StringTokenizer st = new StringTokenizer(phone, "-");
		
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}