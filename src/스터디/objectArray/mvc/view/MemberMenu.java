package 스터디.objectArray.mvc.view;

import java.util.Scanner;

import 스터디.objectArray.mvc.controller.MemberController;
import 스터디.objectArray.mvc.model.vo.Member;

public class MemberMenu {
	private MemberController mc = new MemberController();
	private Scanner sc = new Scanner(System.in);
	private Member m = new Member();

	public void mainMenu() {
		int ch=0;
		while (true) {
			System.out.println("====== 회원 관리 메뉴 ======");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("6. 회원 정보 정렬");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 선택 : ");
			int choice = sc.nextInt();
			sc.nextLine();
			ch=1;
			switch (choice) {
			case 1:
				insertMember();
				if(ch==1) {
					continue;
				}
					
				break;
			case 2:
				searchMember();
				if(ch==1) {
					continue;
				}
				break;
			case 3:
				updateMember();
				if(ch==1) {
					continue;
				}
				break;
			case 4:
				deleteMember();	
				if(ch==1) {
					continue;
				}
				break;
			case 5:
				printAllMember();
				if(ch==1) {
					continue;
				}
				break;
			case 6:
				 sortMember();
				 if(ch==1) {
					continue;
				}
				break;
			case 9:
				return;
			default:
				System.out.println("메뉴를 잘못 입력하셨습니다. 다시 선택해주세요.");
				continue;

			}
		}
	}

	public void insertMember() {
		if (mc.getMemberCount() > mc.SIZE)
		{
			return;
		}
		else
		{
			System.out.println("현재 회원 수는 "+mc.getMemberCount()+"명 이므로 등록 가능");
			
			System.out.println("아이디를 입력(중복 체크) :");
			String id = sc.nextLine();
			
			m = mc.checkId(id);
			if (m != null) {
				System.out.println("동일한 아이디가 존재합니다. 회원등록 실패");
			} else {
				System.out.println("비밀번호 입력 :");
				String pwd = sc.nextLine();
				System.out.println("이름 입력 :");
				String name = sc.nextLine();
				System.out.println("나이 입력 :");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("성별 입력 :");
				char gender = sc.nextLine().charAt(0);
				System.out.println("이메일 입력 :");
				String email = sc.nextLine();
				m = new Member(id, pwd, name, age, gender, email);
				mc.insertMember(m);
				System.out.println("성공적으로 회원 등록이 되었습니다.");
			}
		}
			
		
	}

	public void searchMember() {
		while (true) {
			System.out.println("====== 회원 정보 검색 ======");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 이전 메뉴로");
			System.out.println("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			System.out.println("검색 내용: ");
			String search = sc.nextLine();

			switch (menu) {
			case 1:
				m = mc.searchMember(menu, search);
				if (m == null)
					System.out.println("검색된 결과가 없습니다.");
				else
					System.out.println(m.info());
				break;
			case 2:
				m = mc.searchMember(menu, search);
				if (m == null)
					System.out.println("검색된 결과가 없습니다.");
				else
					System.out.println(m.info());
				break;
			case 3:
				m = mc.searchMember(menu, search);
				if (m == null)
					System.out.println("검색된 결과가 없습니다.");
				else
					System.out.println(m.info());
				break;
			case 9:
				mainMenu();
			default:
				System.out.println("메뉴를 잘못 입력하셨습니다. 다시 선택해주세요.");
				continue;

			}
			break;
		}
	}

	public void updateMember() {

		while (true) {
			System.out.println("====== 회원 정보 수정 ======");
			System.out.println("1. 비밀번호 수정");
			System.out.println("2. 이름 수정");
			System.out.println("3. 이메일 수정");
			System.out.println("9. 이전 메뉴로");
			System.out.println("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			System.out.println("변경할 회원 아이디: ");
			String userId = sc.nextLine();
			m = mc.checkId(userId);

			if (m == null)
				System.out.println("변경할 회원이 존재하지 않습니다");
			else {
				System.out.println(m.info());
				System.out.println("변경 내용 입력:");
				String update = sc.nextLine();

				switch (menu) {
				case 1:
					mc.updateMember(m, menu, update);
				case 2:
					mc.updateMember(m, menu, update);
					break;
				case 3:
					mc.updateMember(m, menu, update);
				case 9:
					mainMenu();
				default:
					System.out.println("메뉴를 잘못 입력하셨습니다. 다시 선택해주세요.");
					continue;

				}
				System.out.println("회원의 정보가 변경되었습니다");
			}
			break;
		}

	}

	public void deleteMember() {
		System.out.println("삭제할 회원 아이디");
		String userId = sc.nextLine();
		m = mc.checkId(userId);
		if (m == null)
			System.out.println("삭제할 회원이 존재하지 않습니다");
		else {
			System.out.println(m.info());
			System.out.println("정말 삭제하시겠습니까? (y/n)");
			char choice = sc.nextLine().charAt(0);
			if(choice == 'y' || choice =='Y')
				mc.deleteMember(userId);
			System.out.println("회원의 정보가 삭제되었습니다.");
			
		}
		 
	}

	public void printAllMember() {
		Member[] mem = mc.getMem();
		for(int i=0; i<mem.length; i++) {
			if(mem[i]!=null)
			System.out.println(mem[i].info());
		}
	}
		
	public void sortMember() {
		Member[] sortMem = null; // 정렬 결과를 받아 줄 객체배열 초기화
		
		while(true)
		{
			System.out.println("====== 회원 정보 정렬 ======");
			System.out.println("1. 아이디 오름차순 정렬");
			System.out.println("2. 아이디 내림차순 정렬");
			System.out.println("3. 나이 오름차순 정렬");
			System.out.println("4. 나이 내림차순 정렬");
			System.out.println("5. 성별 내림차순 정렬(남여순)");
			System.out.println("9. 이전 메뉴로");
			System.out.println("메뉴 선택: ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				sortMem = mc.sortIdAsc();
				break;
			case 2 :
				sortMem = mc.sortIdDesc();
				break;
			case 3:
				sortMem = mc.sortAgeAsc();
				break;
			case 4 :
				sortMem = mc.sortAgeDesc();
				break;
			case 5:
				sortMem = mc.sortGenderDesc();
				break;
			case 9:
				mainMenu();
			default : 
				System.out.println("메뉴를 잘못 입력하셨습니다. 다시 선택해주세요.");
				continue;
			
			}
			for(int i=0; i<sortMem.length; i++)
			{
				System.out.println(sortMem[i].info());
			}
			break;
			
			
		}

	}

}
