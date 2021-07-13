package 스터디.exception.hw1.controller;

import 스터디.exception.hw1.model.vo.Guests;
import 스터디.exception.hw1.model.vo.RollerCoaster;

public class RideController {
		
	public void cutGuests()
	{
		Guests[] gs = new Guests[4];
		gs[0] = new Guests("홍길동", 17, 'M', 120.2);
		gs[1] = new Guests("유관순", 20, 'F', 102.3);
		gs[2] = new Guests("김유신", 23, 'M', 110.4);
		gs[3] = new Guests("김흥부", 21, 'M', 112.5);
		
		Guests[] onboard = new Guests[RollerCoaster.PERMITNUMBER];
		
		int j=0;
		try {
			for(int i=0; i<gs.length; i++)
			{
				if(gs[i].getHeight()>= RollerCoaster.CUTHEIGHT)
				{
					onboard[j++] = gs[i];
					//System.out.println(gs[i]);
					
				}
			}
			
		}catch(IndexOutOfBoundsException e) {
			System.out.println("문제가 발생한 해당 배열의 인덱스 번호 :"+e.getMessage());
			
		}finally {
			System.out.println("인원이 가득 찼습니다. 다음 차례를 기다리세요");
			System.out.println("이번 차례 탑승 명단");
			int total=0;
			
			for(int i=0; i<RollerCoaster.PERMITNUMBER; i++)
			{
				System.out.println("이름 : "+onboard[i].getName()+", 키 : "+onboard[i].getHeight());
				total += RollerCoaster.PRICE;
			}
			System.out.println("탑승자 요금 : "+total);
		}
	}
}
