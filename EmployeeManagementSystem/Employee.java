package EmployeeManagementSystem;
import java.util.*;

public class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	private double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString()
	{
		return "["+this.id+" "+this.name+" "+this.salary+"]";
	}
	@Override
	public boolean equals(Object o)
	{
		Employee e= (Employee)o;
		if(this.name.equals(e.name) && this.id==e.id && this.salary==e.salary)
		{
			return true;
		}
		return false;
	}
	public int hashCode()
	{
		return Objects.hash(id,name,salary);
	}
	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return (e.id-this.id);
	}

}
