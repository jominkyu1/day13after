//instan
class Car extends Object{
	
}

class FireCar extends Car{
	
}
public class CastingEx17 extends Thread{
	public static void main(String[] args) {
		FireCar fc = new FireCar();
		
		if(fc instanceof Car) {
			System.out.println("fc instanceof Car: 가능");
		}else {
			System.out.println("fc instanceof Car: 불가능");
		}
	}
}
