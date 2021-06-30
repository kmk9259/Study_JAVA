package 스터디.variable.practice01.example;

import java.util.Scanner;

public class VariablePractice {
	private Scanner sc = new Scanner(System.in);
	public void method1()
	{
		System.out.println("이름을 입력하세요: ");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력하세요: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("성별을 입력하세요(남/여): ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("키를 입력하세요(cm) ");
		double height = sc.nextDouble();
		
		System.out.println("키" +height+"인 "+age+"살 "+gender+name+"님 반갑습니다^^");
	}
	public void method2()
	{
		System.out.println("첫 번째 정수를 입력하세요 :");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수를 입력하세요 :");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : "+(num1+num2));
		System.out.println("빼기 결과 : "+(num1-num2));
		System.out.println("곱하기 결과 : "+(num1*num2));
		System.out.println("나누기 몫 결과 : "+(num1/num2));
	}
	public void method3()
	{
		System.out.println("가로 :");
		double x = sc.nextDouble();
		System.out.println("세로 :");
		double y = sc.nextDouble();
		
		System.out.println("면적 : "+ (x*y));
		System.out.println("둘레 : "+ (x+y)*2);
	}
	public void method4()
	{
		System.out.println("문자열을 입력하세요 :");
		String str = sc.nextLine();
		
		for(int i=0; i<str.length(); i++)
		{
			System.out.println((i+1)+"번째 문자 : "+str.charAt(i) );
		}
	}
	

}
