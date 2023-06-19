enum ENT1{
	ENUMT(1), ENUMT2(2);
	private final int num;
	
	ENT1(int num){
		this.num=num;
	}
	}
class Mother18{
	int a=100;
	
	public void m18() {
		System.out.println("부모클래스 m18() 메소드");
	}
}

class Child18 extends Mother18{
	int a=200;
	
	@Override
	public void m18() {
		System.out.println("오버라이딩한 m18() 메소드");
	}
}

public class CastingEx18 {
	public static void main(String[] args) {
			
		new Mother18().m18();
		new Child18().m18();
		
		Mother18 mother18 = new Child18();
		
		System.out.println(mother18.a);
		//부모와 자손에 동일 멤버 변수가 정의 된 경우에는 참조변수 타입에 의해서 호출되는 멤버변수가 결정된다.
		
		Child18 child18 = (Child18) mother18;
		
		System.out.println(child18.a);
		
		ENT1 str = ENT1.valueOf("ENUMT");
		System.out.println(str);
		
		
	}
}