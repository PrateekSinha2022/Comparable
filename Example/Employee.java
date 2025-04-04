package Example;

public class Employee {
	String name;
	int salary;
	long no = 0;
	
	public Employee(String name,int salary,long no)
	{
		this.name=name;
		this.salary=salary;
		this.no=no;
	}
	Employee()
	{
		
	}
	Employee(int salary)
	{
		salary=salary+10;
	}
	Employee(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}

}
