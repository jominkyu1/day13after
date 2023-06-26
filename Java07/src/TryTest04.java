class Mb04{
	String id = "abc";
	String name = "홍길동";
}

class MyExcep1 extends Exception{
	public MyExcep1(String str){
		super(str);
	}
}
public class TryTest04 {
	public static void main(String[] args) {
		Mb04 mb = new Mb04();

		mb=null;
		try {
			throw new MyExcep1("MyExcep");

		}catch(Throwable e){
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
	}
}
