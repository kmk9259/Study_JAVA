package 스터디.object.hw3.view;

import java.util.Scanner;

import 스터디.object.hw3.model.vo.Employee;

public class EmpMenu {

	private Scanner sc = new Scanner(System.in);
	int ch=0;
	public EmpMenu() {
	}
	private Employee emp;
	public void mainMenu() {
		
		while (true) {
			System.out.println("===== 사원 정보 관리 프로그램 =====");
			System.out.println("1. 새 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 출력");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			ch=1;
			switch (num) {
			case 1:
				 inputEmployee();
				 if(ch==1)
						continue;
				break;
			case 2:
				if(emp!= null)
					modifyEmployee(emp);
				else
				{
					System.out.println("입력된 정보가 없습니다. 다시 입력해주세요.");
					continue;
				}
				if(ch==1)
					continue;
				
				break;
			case 3:
				emp = null;
				if(ch==1)
					continue;
				break;
			case 4:
				if(emp!= null)
					System.out.println(emp.information());
				else
				{
					System.out.println("입력된 정보가 없습니다. 다시 입력해주세요.");
					continue;
				}
				if(ch==1)
					continue;
				break;
			case 9:
				return;
			default:
				System.out.println("잘못 입력, 다시 선택");
				continue;
			}
			break;

		}
	}

	public Employee inputEmployee() {
	
		System.out.println("====사원 정보 입력====");
		System.out.println("사원명 입력 : ");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.println("부서명 입력");
		String dept = sc.nextLine();
		System.out.println("직급 입력");
		String job = sc.nextLine();
		System.out.println("나이 입력");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("성별 입력");
		char gender = sc.nextLine().charAt(0);
		System.out.println("급여 입력");
		int salary = sc.nextInt();
		System.out.println("보너스포인트 입력");
		double bounusPoint = sc.nextDouble();
		System.out.println("전화번호 입력");
		String phone = sc.nextLine();
		sc.nextLine();
		System.out.println("주소 입력");
		String address = sc.nextLine();
		emp = new Employee(name, dept, job, age, gender, salary, bounusPoint, phone, address);

		return emp;
	}

	public void modifyEmployee(Employee emp) {
		
		int num = 0;
		while (true) {
			System.out.println("===== 사원 정보 수정 메뉴 =====");
			System.out.println("1. 이름 변경");
			System.out.println("2. 급여 변경");
			System.out.println("3. 부서 변경");
			System.out.println("4. 직급 변경");
			System.out.println("9. 이전 메뉴로");
			System.out.println("메뉴 번호 선택 : ");
			num = sc.nextInt();
			sc.nextLine();
			ch=1;
			switch (num) {
			case 1:
				System.out.println("이름 입력:");
				String name1 = sc.nextLine();
				emp.setEmpName(name1);
				if(ch==1)
					continue;
				break;
			case 2:
				System.out.println("급여 입력:");
				int salary = sc.nextInt();
				sc.nextLine();
				emp.setSalary(salary);
				if(ch==1)
					continue;
				break;
			case 3:
				System.out.println("부서 입력:");
				String dept = sc.nextLine();
				emp.setDept(dept);
				if(ch==1)
					continue;
				break;
			case 4:
				System.out.println("직급 입력:");
				String job = sc.nextLine();
				emp.setJob(job);
				if(ch==1)
					continue;
				break;
			case 9:
				mainMenu();
				break;
			default:
				System.out.println("잘못 입력, 다시 선택");
				continue;
			}

			break;

		}

	}

}
