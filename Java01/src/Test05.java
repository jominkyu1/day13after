/*	전달인자 갯수가 다른 메서드 오버로딩 예제 */

class Mt05{
	void pr(int a,int b) {
		System.out.println(a+"\t"+b);
	}
	
	void pr(int a) {
		System.out.println(a);
	}
	
	void pr(int a, int b, int c) {
		System.out.println(a+"\t"+b+"\t"+c);
	}
}

public class Test05 {
	public static void main(String[] args) {
		Mt05 mt = new Mt05();
		mt.pr(100);
		mt.pr(100, 200);
		mt.pr(100, 200, 300);
	}
}