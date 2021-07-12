package 스터디.API.hw6;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateCalculator {
	
	public long leapDate() {
		Calendar today=Calendar.getInstance();
		int nowYear = today.get(Calendar.YEAR);
		int nowMonth = today.get(Calendar.MONTH)+1;
		int nowDay = today.get(Calendar.DATE);
		long sumDays=0L;
		
		for(int i=1; i<=nowYear; i++) 
		{ 				
			if(i==nowYear)
			{ 							
				if(isLeapYear(i)) 
					System.out.println("올해는 윤년입니다.");
				else 
					System.out.println("올해는 평년입니다.");
				for(int j=1; j<=nowMonth; j++)
				{ 		
					if(j==nowMonth) 
					{				
						for(int n=1;n<=nowDay;n++) 	// Date, 오늘이 되면
						{
							sumDays+=1;
						}
					}
					else if(j==2) 
					{
						if(isLeapYear(i)) 
							sumDays+=29;
						else 
							sumDays+=28;
					}
					else if(j==4||j==6||j==9||j==11) 
					{
						sumDays+=30;
					}
					else 
						sumDays+=31;
				}
			}
			else 
			{
				if(isLeapYear(i)) 
					sumDays+=366;
				else 
					sumDays+=365;	
			}
		}
		return sumDays;
	}
	public boolean isLeapYear(int year) 
	{
		if(year%4==0 && year%100!=0 || year%400==0) 
			return true;
		else 
			return false;
	}
	//GregorianCalendar()클래스에서 제공하는 isLeapYear() 메소드 써보기

}
