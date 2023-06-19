import java.util.ArrayList;
import java.util.List;

class HandPhone{
	protected String model;
	protected String number;

	public HandPhone() {}
	public HandPhone(String model, String number) {
		this.model=model;
		this.number=number;
	}

	public String getModel() {
		return model;
	}
	public String getNumber() {
		return number;
	}
}

class DicaPhone extends HandPhone{
	protected String pixel;

	public DicaPhone() {}
	public DicaPhone(String model, String number, String pixel) {
		super(model, number);
		this.pixel=pixel;
	}
	
	public void prnDicaPhone() {
		System.out.printf("모델명: %s\t 번호: %s\t 화소수: %s", model, number, pixel);
	}
}

public class Ex16_05 {
	public static void main(String[] args) {
		DicaPhone dp = new DicaPhone("갤럭시", "010", "1024");
		dp.prnDicaPhone();
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("aa");
	}
}
