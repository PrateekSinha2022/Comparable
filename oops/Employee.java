package oops;

public class Employee {
	private String name="Ravi";
	private int age=35;
	private long phone_num=9874563210l;
	private double salary=0.0;
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String s)
	{
		this.name=s;
	}
	
	public int getAge()
	{
		return this.age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public double getSalary()
	{
		return this.salary;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public long getPhone()
	{
		return this.phone_num;
	}
	public void setPhone(long phone)
	{
		this.phone_num=phone;
	}

}
