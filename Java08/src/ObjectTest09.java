import java.util.Calendar;
import java.util.GregorianCalendar;

public class ObjectTest09 {
	public static void main(String[] args) {
		GregorianCalendar gCal = new GregorianCalendar();
		
		int year=gCal.get(Calendar.YEAR);
		int month=gCal.get(Calendar.MONTH)+1;
		int date=gCal.get(Calendar.DATE);
		
		System.out.printf("%d년 %d월 %d일 -> ", year, month, date);
		if(gCal.isLeapYear(year)) { //윤년메소드
			System.out.println("윤년");
		}else {
			System.out.println("윤년이 아님");
		}
	}
}