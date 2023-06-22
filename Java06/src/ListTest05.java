
import java.util.Vector;

public class ListTest05 {
	public static void main(String[] args) {
		Vector<Number> vec = new Vector<>();

		vec.add(15);
		vec.add(252.2);
		vec.add(2221.1);
		vec.add(12345);
		System.out.println(vec);

		double findData=2221.1;

		int index = vec.indexOf(findData);
		if(index==-1) System.out.println("NOT FOUND");
		else {
			vec.remove(index); 
			System.out.println("DELETED");
		}

		System.out.println("===삭제후===");
		for(Number d : vec) {
			System.out.print(d+" ");
		}
	}
}
