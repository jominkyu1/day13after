import java.util.Calendar;
// java.util패키지의 Calendar 추상클래스
// 달력클래스
public class ObjectTest08 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int am_pm = cal.get(Calendar.AM_PM);
		
		
		System.out.printf("%d년 %d월 %d일 ", year, month, date);
		switch(am_pm) {
		case Calendar.AM:
			System.out.print("AM");
			break;
		case Calendar.PM: 
			System.out.print("PM");
			break;
		}
		System.out.printf(" %d시 %d분 %d초", hour, minute, second);
	}
}
