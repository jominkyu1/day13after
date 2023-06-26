// try catch문의 실행 순서-1
public class TryTest09 {
	public static void main(String[] args) {
		System.out.print(1);
		System.out.print(2);
		
		try {
			System.out.print(3);
			System.out.print(4/0);
		}catch(Exception e){
			System.out.println(e.getMessage());
			
			System.out.print(5);
		}
		System.out.print(6);
	}
}
