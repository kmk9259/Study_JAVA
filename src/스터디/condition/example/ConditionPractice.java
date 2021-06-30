package 스터디.condition.example;

import java.util.Scanner;

public class ConditionPractice {//조건문
	private Scanner sc = new Scanner(System.in);
	public void practice1()
	{
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		System.out.println("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1: 
			System.out.println("입력 메뉴입니다.");
			break;
		case 2: 
			System.out.println("수정 메뉴입니다.");
			break;
		case 3: 
			System.out.println("조회 메뉴입니다.");
			break;
		case 4: 
			System.out.println("삭제 메뉴입니다.");
			break;
		case 9: 
			System.out.println("프로그램이 종료됩니다.");
			return; 
		default :
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	public void practice2()
	{
		System.out.println("숫자를 한 개 입력하세요 :");
		int num = sc.nextInt();
		
		if(num>0)
		{
			if(num%2 ==0)
				System.out.println("짝수");
			else
				System.out.println("홀수");
		}
		else
			System.out.println("양수만 입력해주세요");
	}
	public void practice3()
	{
		System.out.println("국어 : ");
		int k= sc.nextInt();
		System.out.println("영어 : ");
		int e= sc.nextInt();
		System.out.println("수학 : ");
		int m= sc.nextInt();
		
				
		if(k>=40 && e>=40 && m>=40 &&((k+e+m)/3.0)>=60)
		{
			System.out.println("국어 : "+k);
			System.out.println("영어 : "+e);
			System.out.println("수학 : "+m);
			System.out.println("합계 : "+(k+e+m));
			System.out.println("평균 : "+(k+e+m)/3.0);
			System.out.println("축하합니다, 합격입니다!");
		}
		else
			System.out.println("불합격");
	}
	public void practice4()
	{
		System.out.println("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 3:
		case 4:
		case 5:
			System.out.println(num + "월은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(num + "월은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(num + "월은 가을입니다.");
			break;
		case 1:
		case 2:
		case 12:
			System.out.println(num + "월은 겨울입니다.");
			break;
		default :
			System.out.println(num + "월은 잘못 입력된 달입니다.");
		}
	}
	public void practice5()
	{
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호 : ");
		String pw = sc.nextLine();
		
		if(id.equals("user1") && pw.equals("1234"))
			System.out.println("로그인 성공");
		else if (!id.equals("user1"))
			System.out.println("아이디가 틀렸습니다.");
		else if (!pw.equals("1234"))
			System.out.println("비밀번호가 틀렸습니다.");
	}
	public void practice6()
	{
		System.out.println("권한을 확인하고자 하는 회원 등급 :");
		String member = sc.nextLine();
		
		switch(member) {
		case "관리자":
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "회원":
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;
		default :
			System.out.println("잘못 입력했습니다.");
		}
	}
	public void practice7()
	{
		System.out.println("키(m)를 입력해 주세요 :");
		double h = sc.nextDouble();
		System.out.println("몸무게(kg)를 입력해 주세요 :");
		double w = sc.nextDouble();
		double bmi = w / (h*h);
		System.out.println("BMI 지수 : "+bmi);
		
		String result = (bmi<18.5) ? "저체중" : (bmi>=18.5 && bmi <23)? "정상체중" : 
			(bmi>=23 && bmi<25)? "과체중" : (bmi>=25 && bmi<30) ? "비만" :"고도 비만";
		
		System.out.println(result);
	}
	public void practice8()
	{
		System.out.println("피연산자1 입력 :");
		int x = sc.nextInt();
		System.out.println("피연산자2 입력 :");
		int y = sc.nextInt();
		sc.nextLine();
		System.out.println("연산자를 입력(+,-,*,/,%) :");
		char op = sc.nextLine().charAt(0);
		
		switch(op) {
		case '+' :
			System.out.println(x+op+y +"="+(x+y));
			break;
		case '-' :
			System.out.println(x+op+y +"="+(x-y));
			break;
		case '*' :
			System.out.println(x+op+y +"="+(x*y));
			break;
		case '/' :
			System.out.println(x+op+y +"="+(x/y));
			break;
		case '%' :
			System.out.println(x+op+y +"="+(x%y));
			break;
		default :
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
	}
	public void practice9()
	{
		System.out.println("중간 고사 점수 :");
		int mid = sc.nextInt();
		System.out.println("기말 고사 점수 :");
		int fin = sc.nextInt();
		System.out.println("과제 점수 :");
		int hw = sc.nextInt();
		System.out.println("출석 회수 :");
		int at = sc.nextInt();
		
		if(((mid * 0.2)+(fin * 0.3)+(hw * 0.3)+at) >=70 && (at*0.7)>=14)
		{
			System.out.println("===========결과==========");
			System.out.println("중간 고사 점수(20) :"+(mid * 0.2));
			System.out.println("기말 고사 점수(30) :"+(fin * 0.3));
			System.out.println("과제 점수 (30) :"+(hw * 0.3));
			System.out.println("출석 점수 (20) :"+at);
			System.out.println("총점 :"+((mid * 0.2)+(fin * 0.3)+(hw * 0.3)+at));
			System.out.println("PASS");
		}
		else if(((mid * 0.2)+(fin * 0.3)+(hw * 0.3)+at) <70)
		{
			System.out.println("===========결과==========");
			System.out.println("FAIL [점수 미달] (총점 "+((mid * 0.2)+(fin * 0.3)+(hw * 0.3)+at)+")");
		}
		else if((at*0.7)<14)
		{
			System.out.println("===========결과==========");
			System.out.println("FAIL [출석 횟수 부족] ("+(at*0.7)+"/20)");
		}
		else
		{
			System.out.println("===========결과==========");
			System.out.println("FAIL [점수 미달] (총점 "+((mid * 0.2)+(fin * 0.3)+(hw * 0.3)+at)+")");
			System.out.println("FAIL [출석 횟수 부족] ("+(at*0.7)+"/20)");
		}
	}
	 public void practice10()
	 {
		 System.out.println("실행할 기능을 선택하세요.");
		 System.out.println("1. 메뉴 출력");
		 System.out.println("2. 짝수/홀수");
		 System.out.println("3. 합격/불합격");
		 System.out.println("4. 계절");
		 System.out.println("5. 로그인");
		 System.out.println("6. 권한 확인");
		 System.out.println("7. BMI");
		 System.out.println("8. 계산기");
		 System.out.println("9. Pass/Fail");
		 System.out.println("선택 : ");
		 int num = sc.nextInt();
		 
		 switch(num) {
		 case 1:
			 practice1();
			 break;
		 case 2:
			 practice2();
			 break;
		 case 3:
			 practice3();
			 break;
		 case 4:
			 practice4();
			 break;
		 case 5:
			 practice5();
			 break;
		 case 6:
			 practice6();
			 break;
		 case 7:
			 practice7();
			 break;
		 case 8:
			 practice8();
			 break;
		 case 9:
			 practice9();
			 break;
		 }
		 
	 }

}
