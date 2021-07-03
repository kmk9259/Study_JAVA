package 스터디.inherit.hw1.run;

import java.util.Scanner;

import 스터디.inherit.hw1.model.vo.Employee;
import 스터디.inherit.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] s = new Student[3];
		
		s[0] =new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		s[1] =new Student("김말똥", 21, 187.3, 80.0, 2, "경영학");
		s[2] =new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i].information());
		}
		System.out.println();
		
		Employee[] e = new Employee[10];
		int cnt =0;
		while(true)
		{
			System.out.println("사원이름 입력:");
			String name = sc.nextLine();
			System.out.println("사원나이 입력:");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.println("사원신장 입력:");
			double height = sc.nextDouble();
			System.out.println("사원몸무게 입력:");
			double weight = sc.nextDouble();
			System.out.println("급여 입력:");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.println("부서 입력:");
			String dept = sc.nextLine();
			e[cnt++] = new Employee(name,age,height,weight,salary,dept);
			
			System.out.println("계속 추가 ?(y/n)");
			char add = sc.nextLine().charAt(0);
			if(add =='n' || add=='N')
				break;
		}
		for(int i=0; i<cnt; i++)
		{
			System.out.println(e[i].information());
		}
		
		
		
	}

}
