package 스터디.inherit.hw1.model.vo;

public class Employee extends Person {
	private int salary;
	private String dept;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name,int age, double height, double weight,int salary,String dept) {
		super(age, height, weight);
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String information() {
		
		return super.information()+", salary : "+salary+", dept : "+dept;
	}
	
	

}
