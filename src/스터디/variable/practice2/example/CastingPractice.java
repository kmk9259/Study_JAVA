package 스터디.variable.practice2.example;

import java.util.Scanner;

public class CastingPractice {
	private Scanner sc = new Scanner(System.in); 
	public void method1()
	{
		System.out.println("문자 : ");
		char c = sc.nextLine().charAt(0);
		
		System.out.println("A Unicode : "+ (int)c);
	}
	public void method2()
	{
		System.out.println("국어 : ");
		double k = sc.nextDouble();
		System.out.println("영어 : ");
		double e = sc.nextDouble();
		System.out.println("수학 : ");
		double m = sc.nextDouble();
		
		System.out.println("총점 : "+ (int)(k+e+m));
		System.out.println("평균 : "+ (int)(k+e+m)/3);
	}
	public void method3()
	{
		int x = 10;
		int y = 4;
		
		float f = 3.0f;
		double d = 2.5;
		char c ='A';
		
		System.out.println(x/y);
		System.out.println((int)d);
		
		System.out.println(y*d);
		System.out.println((double)x);

	}

	

}
