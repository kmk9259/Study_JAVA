package 스터디.API.hw6;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ShowDate {
	public static void main(String[] args) {
		DateCalculator totalDay = new DateCalculator();
		Calendar calendar = Calendar.getInstance();
		boolean temp =totalDay.isLeapYear(calendar.get(GregorianCalendar.YEAR));
		if(temp ==true)
			System.out.println("올해는 윤년입니다.");
		else
			System.out.println("올해는 평년입니다.");
		System.out.println("총 날짜 수 :"+totalDay.leapDate());
		}

}
