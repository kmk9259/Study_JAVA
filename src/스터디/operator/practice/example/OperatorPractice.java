package 스터디.operator.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	private Scanner sc = new Scanner(System.in);
	
	public void practice1()
	{
		System.out.println("정수 : ");
		int num = sc.nextInt();
		if(num>0)
			System.out.println("양수다.");
		else
			System.out.println("양수가 아니다");
	}
	public void practice2()
	{
		System.out.println("정수 : ");
		int num = sc.nextInt();
		if(num>0)
			System.out.println("양수다.");
		else
		{
			if(num==0)
				System.out.println("0이다.");
			else
				System.out.println("음수다.");
		}	
	}
	public void practice3()
	{
		System.out.println("정수 : ");
		int num = sc.nextInt();
		if(num%2==0)
			System.out.println("짝수다.");
		else
			System.out.println("홀수");
	}
	public void practice4()
	{
		System.out.println("인원 수 : ");
		int num = sc.nextInt();
		System.out.println("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : "+ candy/num);
		System.out.println("남는 사탕 개수 : "+ candy%num);
	}
	public void practice5()
	{
		System.out.println("이름 :");
		String name = sc.nextLine();
		System.out.println("학년(숫자만) :");
		int grade = sc.nextInt();
		System.out.println("반(숫자만)");
		int ban = sc.nextInt();
		System.out.println("번호(숫자만)");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("성별(M/F)");
		char gender = sc.nextLine().charAt(0);
		String gen;
		if(gender=='F')
			gen = "여학생";
		else
			gen = "남학생";
		System.out.println("성적(소수점 아래 둘째 자리까지) :");
		double good = sc.nextDouble();
		
		System.out.println(grade+"학년"+ban+"반"+number+"번"+name+" "+gen
							+"의 성적은 "+good+"이다.");
	}
	public void practice6()
	{
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		String result = (age<=13)? "어린이" : (age<=19 && age>13)? "청소년" : "성인";
		System.out.println(result);
	}
	public void practice7()
	{
		System.out.println("국어 : ");
		int k= sc.nextInt();
		System.out.println("영어 : ");
		int e= sc.nextInt();
		System.out.println("수학 : ");
		int m= sc.nextInt();
		
		System.out.println("합계 : "+(k+e+m));
		System.out.println("평균 : "+(k+e+m)/3.0);
		
		if(k>=40 && e>=40 && m>=40 &&((k+e+m)/3.0)>=60)
			System.out.println("합격");
		else
			System.out.println("불합격");
	}
	public void practice8()
	{
		System.out.println("주민번호를 입력하세요(-포함) : ");
		String ssn = sc.nextLine();
		
		if(ssn.charAt(7)=='2')
			System.out.println("여자");
		else
			System.out.println("남자");
	}


}
