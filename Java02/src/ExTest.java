import java.util.Scanner;
class ExTest01{
	public void input(int ...arr) {
		System.out.println(arr.length);
	}
}
public class ExTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month=0;
		
		
		ExTest01 ex = new ExTest01();
		
		ex.input(1,2,3,4,5,6,7,8,9,10);
		
		int i;
		
		for(i=0;i<10;i++) {
			if(i%2==0) {
				//짝수
			}else {
				//홀수
			}
		}
	}
}