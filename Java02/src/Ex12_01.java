//1. p() 메소드를 오버로딩하여 두 int 변수에 대해서 두 double에 대해서 최대
//값을 구하는 메소드를 정의하시오.

public class Ex12_01 {
	public int p(int a, int b) {
		if(a>b) return a;
		else return b;
	}
	
	public double p(double a, double b) {
		if(a>b) return a;
		else return b;
	}
	
	public static void main(String[] args) {
		Ex12_01 ex = new Ex12_01();
		
		System.out.println(ex.p(10, 20));
		
		System.out.println(ex.p(12.34, 56.78));
		
	}
}