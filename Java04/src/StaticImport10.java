// static import문을 사용하면 static 멤버인 정적변수나 정적 메소드를 호출할때 클래스명 생략가능

import static java.lang.System.out;
import static java.lang.Math.*;


public class StaticImport10 {
	public static void main(String[] args) {
		out.println(PI);
		out.println(random()*10);
	}
}