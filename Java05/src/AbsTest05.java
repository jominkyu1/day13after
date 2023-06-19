import com.naver.model101.ShapeClass;
import com.naver.model102.*;

public class AbsTest05 {
	public static void drawer(ShapeClass sc) {
		sc.draw();
	} 
	public static void main(String[] args) {
		Circ c = new Circ();
		Rect r = new Rect();
		Tria t = new Tria();

		c.draw(); r.draw(); t.draw();
		System.out.println("========");
		
		ShapeClass[] ref = {c, r, t};
		for(ShapeClass temp : ref) {
			temp.draw();
		}
		
		drawer(c);
		drawer(c);
	}
}
