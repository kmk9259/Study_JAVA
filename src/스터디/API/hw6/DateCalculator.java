package 스터디.API.hw6;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateCalculator {
	public long leapDate()
	{
		Calendar calendar = Calendar.getInstance();
		int nowYear = calendar.get(GregorianCalendar.YEAR);
		calendar.set(2021, 4, 20);
		long day=1;
		for(int i=1; i<nowYear; i++)
		{
			if(isLeapYear(i))
				day+=366;
			else
				day+=365;
		}
		
		int month=1;
		int year=1;
		
		while(year<=nowYear)
		{
			month++;
			switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day+=31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				day+=30;
				break;
			case 2:
				if(year %4==0)
				{
					if(year%100!=0 || year%400==0)
						day+=29;
				}
				else 
					day+=28;
				break;
			default:
				month=1;
				break;
			}
			break;
		}
		return day;
		
	}
	public boolean isLeapYear(int year)
	{
		boolean b = true;
		if(year %4==0)
		{
			if(year%100!=0 || year%400==0)
				b=true;
	
		}
		else 
			b = false;
	
		return b;
	}

}
