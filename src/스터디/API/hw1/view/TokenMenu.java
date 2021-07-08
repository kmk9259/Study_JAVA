package 스터디.API.hw1.view;

import java.util.Scanner;

import 스터디.API.hw1.controller.TokenController;

public class TokenMenu {
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	public void mainMenu()
	{
		boolean check=false;
		while(true)
		{
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("9. 프로그램 끝내기");
			System.out.println("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			check = true;
			switch(num) {
			case 1:
				tokenMenu();
				if(check ==true)
					continue;
				break;
			case 2:
				inputMenu();
				if(check ==true)
					continue;
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				continue;
			}
			break;
		}
	}
	public void tokenMenu()
	{
		String str = "J a v a P r o g r a m";
		System.out.println("토큰 처리 전 글자 :"+str);
		System.out.println("토큰 처리 전 개수 : "+str.length());
		str = tc.afterToken(str);
		System.out.println("토큰 처리 후 글자 : "+str);
		System.out.println("토큰 처리 후 개수 : "+str.length());
		System.out.println("모두 대문자로 변환 :"+str.toUpperCase());
	}
	public void inputMenu()
	{
		System.out.println("문자열을 입력: ");
		String input = sc.nextLine();
		String temp =tc.firstCap(input);
		System.out.println("첫 글자 대문자 : "+temp);
		System.out.println("찾을 문자 하나를 입력하세요 : ");
		char one = sc.nextLine().charAt(0);
		int temp2 = tc.findChar(input, one);
		System.out.println(one+"문자가 들어간 개수 : "+temp2);
		
	}


}
