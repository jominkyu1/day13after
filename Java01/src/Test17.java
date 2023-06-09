class Mt17{
	public void change(int[] arr) {
		arr[0] = 20;
	}
}
public class Test17 {
	public static void main(String[] args) {
		int[] x = {10};
		System.out.println("main() x[0] 값: " + x[0]);
		
		Mt17 m = new Mt17();
		
		m.change(x); // x를 20으로 변경
		
		System.out.println("change()메소드 호출 후 main() x[0] 값: " + x[0]);
	}
}