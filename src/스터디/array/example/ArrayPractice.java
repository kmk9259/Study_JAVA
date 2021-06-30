package 스터디.array.example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice 
{
	public void method2()
	{
		int temp[] = new int [10];
		for (int i=0; i<temp.length ; i++)
		{
			System.out.println(temp[i]);
		}
	}
	public void method3()
	{
		int temp[] = new int [6];
		temp[0] = 3;
		temp[1] = 11;
		temp[2] = 22;
		temp[3] = 33;
		temp[4] = 44;
		temp[5] = 44;
		for (int i=0; i<temp.length ; i++)
			System.out.println(temp[i]);
	}
	public void method5()
	{
		int temp[] = new int [5];
		temp[0] = 33;
		temp[1] = 52;
		temp[2] = 93;
		temp[3] = 100;
		temp[4] = 87;
		for (int i=0; i<temp.length ; i++)
			System.out.println(temp[i]);
	}
	public void method6()
	{
		int iarray[] = new int [5];
		String sarray[] = new String [5];
		
		System.out.println(iarray);
		System.out.println(sarray);
	}
	public void method7()
	{
		int iarray[] = {238, 382, 491, 229, 943, 254, 843};
		System.out.println(Arrays.toString(iarray));
		
	}
	public void method8()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("행의 갯수를 입력하고 [Enter] 치세요 =");
		int row = sc.nextInt();
		System.out.println("열의 갯수를 입력하고 [Enter] 치세요 =");
		int col = sc.nextInt();
		sc.nextLine();
		char[][] temp = new char[row][col];
		for(int i=0; i<row; i++)
		{
			System.out.println((i+1)+"번째 행에 입력할 문자3개를 차례대로 입력하고 [Enter] 치세요 :");
			String rowinput = sc.nextLine();
			for(int j=0; j<col; j++)
			{
				temp[i][j] = rowinput.charAt(j);
			}
		}
		
		for(char[] c : temp)
			System.out.println(c);
	}

}
