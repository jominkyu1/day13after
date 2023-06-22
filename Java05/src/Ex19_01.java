import java.util.Arrays;

import com.naver.model101.IShapeClass;
import com.naver.model102.*;

//19장. 인터페이스.pdf No16쪽의 1번문제

public class Ex19_01 {
	/*	com.naver.model101패키지에는 IShapeClass 부모 인터페이스 정의 추상메소드 draw() 정의
	 * 	이 인터페이스를 구현상속받은 자손클래스 Circ2 Rect2 Tria2를 com.naver.model102에 만들어보자
	 * 	출력문장: (타원, 사각형, 삼각형)을 그린다.
	 * */

	public static void main(String[] args) {
		IShapeClass[] ref = {
				new Circ2(), 
				new Tria2(), 
				new Rect2()
		};	
		for(IShapeClass temp : ref) temp.draw();
		
		System.out.println("==========");
		
		IShapeClass.pr(new Tria2());
		IShapeClass.pr(new Circ2());
		IShapeClass.pr(new Rect2());
		
		
	}
}