
public class TryTest11 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch(Exception e){
			System.out.println(e instanceof ArithmeticException);
		}finally {
			System.out.println(6);
		}
	}
}
