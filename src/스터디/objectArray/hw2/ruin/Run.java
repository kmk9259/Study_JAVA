package 스터디.objectArray.hw2.ruin;

import java.util.Scanner;

import 스터디.objectArray.hw2.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		Student[] s = new Student[10];
		int count=0;
		while(count<s.length)
		{
			System.out.println("학년:");
			int grade = sc.nextInt();
			System.out.println("반:");
			int classroom= sc.nextInt();
			sc.nextLine();
			System.out.println("이름:");
			String name=sc.nextLine();
			System.out.println("국어점수:");
			int kor= sc.nextInt();
			System.out.println("영어점수:");
			int eng= sc.nextInt();
			System.out.println("수학점수:");
			int math= sc.nextInt();
			sc.nextLine();
			
			s[count++]=new Student(grade, classroom, name, kor, eng, math);
			System.out.println("계속 입력?(y/n)");
			char check = sc.nextLine().charAt(0);
			if(check=='n')
				break;
		}
		for(int i=0; i<count; i++)
			System.out.println(s[i].info());
	}

}
