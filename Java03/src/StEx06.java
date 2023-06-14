import java.util.Scanner;

public class StEx06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pi: " + Math.PI);
		
		System.out.print("반지름?: ");
		int radius = Integer.parseInt(sc.nextLine());
		
		double area = radius*radius*Math.PI;
		System.out.println("면적: " + area);
	}
}