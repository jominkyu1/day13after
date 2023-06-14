//1. static 변수와 instance 변수의 차이점
//2. {} instance 변수 초기화 블록

class Product13{
	static int count=0; //정적변수
	int serialNumber; //인스턴스변수
	
	{
		++count;
		serialNumber = count;
	}//인스턴스 초기화블록
}

public class ObjTest13 {
	public static void main(String[] args) {
		Product13 p01 = new Product13();
		Product13 p02 = new Product13();
		Product13 p03 = new Product13();
		
		System.out.println("p01 serialNumber: " + p01.serialNumber);
		System.out.println("p02 serialNumber: " + p02.serialNumber);
		System.out.println("p03 serialNumber: " + p03.serialNumber);
		
		System.out.println("Product13 count: " + Product13.count);
	}
}