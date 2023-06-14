//static(정적) method example

class St02{
	private static int a =10; 
	private int b =20; //인스턴스변수
	
	public static void setA(int new_a) {
		a=new_a;
	}
	
	public static int getA() {
		return a;
	}
}

public class StEx02 {
	public static void main(String[] args) {
		St02.setA(100);
		System.out.println(St02.getA());
		
		St02 st = new St02();
		System.out.println(st.getA());
	}
}