package 스터디.loop.practice.example;

import java.util.Scanner;

public class LoopPractice {
	private Scanner sc = new Scanner(System.in);
	public void p1()
	{
		System.out.println("1이상의 숫자를 입력하세요 :");
		int num = sc.nextInt();
		
		if(num>=1)
		{
			for(int i=0; i<num; i++)
				System.out.print((i+1)+" ");
		}
		else
			System.out.println("잘못 입력하셨습니다.");
	
	}
	public void p2()
	{
		System.out.println("1이상의 숫자를 입력하세요 :");
		int num = sc.nextInt();
		
		while(true)
		{
			if(num>=1)
			{
				for(int i=0; i<num; i++)
					System.out.print((i+1)+" ");
				break;
			}
			else
				System.out.println("잘못 입력하셨습니다.");
		}
	}
	public void p3()
	{
		System.out.println("1이상의 숫자를 입력하세요 :");
		int num = sc.nextInt();
		
		if(num>=1)
		{
			for(int i=num; i>0; i--)
				System.out.print((i+1)+" ");
		}
		else
			System.out.println("잘못 입력하셨습니다.");
	}
	public void p4()
	{
		System.out.println("1이상의 숫자를 입력하세요 :");
		int num = sc.nextInt();
		
		while(true)
		{
			if(num>=1)
			{
				for(int i=num; i>0; i--)
					System.out.print((i+1)+" ");
				break;
			}
			else
				System.out.println("잘못 입력하셨습니다.");
		}
	}
	public void p5(){
		 Scanner sc = new Scanner(System.in);
		 System.out.println("정수를 하나 입력하세요 :");
		 int num = sc.nextInt();
		 int sum=0;
		 for(int i=1; i<=num; i++)
		 {
			 sum+=i;
			 System.out.print(i+"+");
		 }
		 System.out.println("="+sum);
	 }
	 public void p6()
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("첫 번째 숫자 :");
		 int num = sc.nextInt();
		 System.out.println("두 번째 숫자 :");
		 int num2 = sc.nextInt();
		 if(num>=1 && num2>=1)
		 {
			 if(num<num2) 
			 {
				 for(int i=num; i<=num2;i++)
				 {
					 System.out.print(i+" ");
				 }
			 }
			 else if(num>num2)
			 {
				 for(int i=num2; i<=num;i++)
				 {
					 System.out.print(i+" ");
				 }
			 }
		 }
		 else
			 System.out.println("1이상의 숫자만을 입력해주세요.");
	 
	 }
	 public void p7()
	 {
		 Scanner sc = new Scanner(System.in);
		 while(true)
		 {
			 System.out.println("첫 번째 숫자 :");
			 int num = sc.nextInt();
			 System.out.println("두 번째 숫자 :");
			 int num2 = sc.nextInt();
			 if(num>=1 && num2>=1)
			 {
				 if(num<num2) 
				 {
					 for(int i=num; i<=num2;i++)
					 {
						 System.out.print(i+" ");
					 }
					 break;
				 }
				 else if(num>num2)
				 {
					 for(int i=num2; i<=num;i++)
					 {
						 System.out.print(i+" ");
					 }
					 break;
				 }
			 }
			 else
			 {
				 System.out.println("1이상의 숫자만을 입력해주세요.");
				 continue;
			 }
				 
			 
		 }
		 
	 }
	 public void p8()
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("숫자 :");
		 int num = sc.nextInt();
		 System.out.println("===== "+num+"단 =====");
		 for(int i=1; i<10; i++)
		 {
			 System.out.println(num+" * "+i+"="+num*i);
		 }
		 System.out.println();
	 }
	 public void p9()
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("숫자 :");
		 int num = sc.nextInt();
		 if(num<2 || num>9)
			 System.out.println("2~9 사이의 숫자만 입력해주세요.");
		 else
		 {
			 System.out.println("===== "+num+"단 =====");
			 for(int i=1; i<10; i++)
			 {
				 System.out.println(num+" * "+i+"="+num*i);
			 }
			 System.out.println();
		 }
		 
	 }
	 public void p10()
	 {
		 Scanner sc = new Scanner(System.in);
		 while(true)
		 {
			 System.out.println("숫자 :");
			 int num = sc.nextInt();
			 if(num<2 || num>9)
			 {
				 System.out.println("2~9 사이의 숫자만 입력해주세요.");
				 continue;
			 }
				 
			 else
			 {
				 System.out.println("===== "+num+"단 =====");
				 for(int i=1; i<10; i++)
				 {
					 System.out.println(num+" * "+i+"="+num*i);
				 }
				 System.out.println();
				 break;
			 }
		 }
		 
		 
	 }
	 public void p11()
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("시작 숫자 : ");
		 int num = sc.nextInt();
		 System.out.println("공차 : ");
		 int r = sc.nextInt();
		 
		 for(int i=0; i<10; i++)
		 {
			 System.out.print(num+" ");
			 num+=r;
		 }
		 
	 }
	 public void p12()
	 {
		 Scanner sc = new Scanner(System.in);
		 while(true)
		 {
			 System.out.println("연산자(+, -, *, /, %) :");
			 String operator = sc.nextLine();
			 if(operator.equals("exit"))
			 {
				 System.out.println("프로그램을 종료합니다.");
				 return;
			 }
			 System.out.println("정수1 :");
			 int num1 = sc.nextInt();
			 System.out.println("정수2 :");
			 int num2 = sc.nextInt();
			 sc.nextLine();
			 
				 
			 switch(operator) {
				case "+" :
					System.out.printf("%d %s %d = %d",num1,operator,num2,(num1+num2));
					break;
				case "-" :
					System.out.printf("%d %s %d = %d\n",num1,operator,num2,(num1-num2));
					break;
				case "*" :
					System.out.printf("%d %s %d = %d\n",num1,operator,num2,(num1*num2));
					break;
				case "/" :
					if(num1==0 || num2==0)
					{
						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
						continue;
					}
					System.out.printf("%d %s %d = %d\n",num1,operator,num2,(num1/num2));
					break;
				case "%" :
					System.out.printf("%d %s %d = %d\n",num1,operator,num2,(num1%num2));
					break;
				default:
					System.out.println("없는 연산자입니다. 다시 입력해주세요.");
					continue;
				}
			 break;
			  
		 }
		 
	 }

}
