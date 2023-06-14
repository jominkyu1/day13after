//정적변수와 인스턴스변수
@FunctionalInterface
interface myInter{
	void printu();
	static void print() {
		System.out.println("aa");
	}
}
class Document14{
	static int count = 0;
	String name;
	
	public Document14() {
		this("제목 없음" + ++count);
		
	}
	
	public Document14(String name) {
		this.name = name;
		System.out.println("문서: " + this.name + " 생성됨");
	}
}

public class ObjTest14 {
	public static void main(String[] args) {
		new Document14();
		new Document14();
		new Document14("자바.txt");
		new Document14();
		
		myInter my = ()-> System.out.println("bb");
		
		my.printu();
		myInter.print();
	}
}