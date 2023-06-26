// try ~catch문의 실행 순서-2

public class TryTest10 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
			System.out.println(5/0);
			System.out.println(4);
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(5);
		}finally {
			System.out.println(6);
		}
	}
}
