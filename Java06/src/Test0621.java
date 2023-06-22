class ConsTest{
    int a;
    
    ConsTest(){
    	System.out.println("기본 생성자");
    }
}//CosTest class
 
class A0621 extends ConsTest{
	
}

class B0621 extends ConsTest{
	
}

public class Test0621 {
	public static void main(String[] args) {
		A0621 a21 = new A0621();
		ConsTest ct21 = a21;
		
		System.out.println(ct21 instanceof B0621);
		
		ConsTest ct211 = new A0621();
		
		System.out.println(ct211 instanceof B0621);
	}
}