package 스터디.Polymorphism.mvc.view;

import java.util.Scanner;

import 스터디.Polymorphism.mvc.controller.LibraryManager;
import 스터디.Polymorphism.mvc.model.vo.Book;
import 스터디.Polymorphism.mvc.model.vo.Member;

public class LibraryMenu {
	private LibraryManager lm = new LibraryManager();
	private Scanner sc= new Scanner(System.in);
	
	public void mainMenu()
	{
		System.out.println("회원 이름 입력: ");
		String name = sc.nextLine();
		System.out.println("회원 나이 입력: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("회원 성별 입력: ");
		char gender = sc.nextLine().charAt(0);
		
		Member mem = new Member(name, age, gender);
		lm.insertMember(mem);
		int ch =0;
		while(true)
		{
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("0. 프로그램 종료하기");
			System.out.println("메뉴 번호 선택: ");
			int num = sc.nextInt();
			sc.nextLine();
			ch=1;
			switch(num) {
			case 1:
				System.out.println(lm.myInfo());
				if(ch ==1)
					continue;
				break;
			case 2:
				selectAll();
				if(ch ==1)
					continue;
				break;
			case 3:
				searchBook();
				if(ch ==1)
					continue;
				break;
			case 4:
				rentBook();
				if(ch ==1)
					continue;
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
				
			}
			break;
		}
		
	}
	public void selectAll()
	{
		Book[] bList = lm.selectAll();
		for(int i=0; i<bList.length; i++)
		{
			System.out.println(i+"번도서  : "+bList[i].toString());
		}
	}
	public void searchBook()
	{
		System.out.println("검색할 제목 키워드 입력 :");
		String keyword = sc.nextLine();
		Book[] searchList = lm.searchBook(keyword);
		
		for(Book b : searchList)
		{
			if(b != null)
				System.out.println(b.toString());
		}
	}
	public void rentBook()
	{
		selectAll();
		System.out.println("대여할 도서 번호 선택 : ");
		int num = sc.nextInt();
		int result = lm.rentBook(num);
		if(result ==0)
			System.out.println("성공적으로 대여되었습니다.");
		else if(result ==1)
			System.out.println("나이 제한으로 대여 불가능입니다.");
		else
		{
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.");
			System.out.println(" 마이페이지를 통해 확인하세요");
		}
			
	}

}
