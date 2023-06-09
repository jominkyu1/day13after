class Mt18{
	public int getSum(int[] arr) {
		int sum =0;
		for(int i:arr) sum += i;
		return sum;
	}
}

public class Test18 {
	public static void main(String[] args) {
		Mt18 m = new Mt18();
		int[] arr = {10, 20, 30, 40, 50};
		
		
		/* 문제) 
		 * Mt18클래스에 int getSum(int[] arr) 메소드를 정의하여 arr배열원소 누적합을 구하여 반환하여 출력*/
		
		System.out.println(m.getSum(arr));
	}
}