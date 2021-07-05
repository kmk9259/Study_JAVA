package 스터디.Polymorphism.mvc.controller;

import 스터디.Polymorphism.mvc.model.vo.AniBook;
import 스터디.Polymorphism.mvc.model.vo.Book;
import 스터디.Polymorphism.mvc.model.vo.CookBook;
import 스터디.Polymorphism.mvc.model.vo.Member;

public class LibraryManager {
	private Member mem=null;
	private Book[] bList = new Book[5];
	
	{ 
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	public void insertMember(Member mem) 
	{
		this.mem = mem;
	}
	public Member myInfo()
	{
		return mem;
	}
	public Book[] selectAll() 
	{
		return bList;
	}
	public Book[] searchBook(String keyword) 
	{
		Book[] sb = new Book[5];
		int count=0;
		for(int i=0; i<sb.length; i++)
		{
			if(bList[i].getTitle().contains(keyword) == true)
			{
				sb[count++] = bList[i];
			}
		}
		return sb;
	}
	public int rentBook(int index)
	{
		AniBook ab = new AniBook();
		CookBook cb = new CookBook();
		int result =0;
		int couponCount=0;
		if(bList[index] instanceof AniBook)
		{
			if(mem.getAge() < ab.getAccessAge())
				result =1;
		}
		else if(bList[index] instanceof CookBook)
		{
			if(cb.isCoupon() ==true)
			{
				mem.setCouponCount(couponCount++);
				result = 2;
				System.out.println("성공적으로 대여 완료, 요리학원 쿠폰이 발급됐습니다.");
			}
			
		}
		return result;
	}

}
