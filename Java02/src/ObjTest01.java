/*add()메소드 오버로딩*/

class MtObj01{
	int add(int a, int b) {
		return a+b;
	}
	
	void add(int a, int b, int[] result) {
		result[0] = a+b;
	} //전달인자 갯수가 다른 오버로딩
}

public class ObjTest01 {
	public static void main(String[] args) {
		MtObj01 mt = new MtObj01();
		
		int result = mt.add(3, 5);
		System.out.println("result=" + result);
		
		int[] result2 = {0};
		mt.add(3, 5, result2); //세번째 인자는 주소값이 전달됨 (인스턴스(참조)변수, 값을 공유)
		System.out.println("result2[0]=" + result2[0]);
	}
}