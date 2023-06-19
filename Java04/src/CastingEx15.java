//instanceof (업캐스팅/다운캐스팅 여부)
// if (참조변수 instanceof 자료형)

class HandPhone15{
	String model;
	String number;
	
	public HandPhone15() {}
	public HandPhone15(String model, String number) {
		this.model=model;
		this.number=number;
	}
}

class DicaPhone15 extends HandPhone15{
	String pixel;
	
	public DicaPhone15() {}
	public DicaPhone15(String model, String number, String pixel) {
		super(model, number);
		this.pixel=pixel;
	}
	
}
public class CastingEx15 {
	public static void main(String[] args) {
		HandPhone15 hp1 = new HandPhone15();
		HandPhone15 hp2 = new DicaPhone15();
		
		System.out.println(hp1 instanceof DicaPhone15);
		System.out.println(hp2 instanceof DicaPhone15);
	}
}
