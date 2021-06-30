package 스터디.object.objectMVC.controller;

import 스터디.object.objectMVC.model.vo.Member;

public class MemberController {
	private Member mem = new Member("admin", "1234", "홍길동", "901022-1562334", 163.0);
	public MemberController() {
		// TODO Auto-generated constructor stub
	}
	public int login (String id, String pwd)
	{
		if(id.equals("admin") && pwd.equals("1234"))
			return 1;
		else
			return 0;
	}
	public Member readInfo()
	{
		return mem;
	}
	public int readAge()
	{
		String age = mem.getCitizenNo().substring(0, 2);
		int age2 = Integer.parseInt(age);
		age2 = 121-age2+1;
		return age2;
	}
	public void updateHeight(double height)
	{
		mem.setHeight(height);
	}
	

}
