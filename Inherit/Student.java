package Inherit;

public class Student extends Person {
	private int studentId;
	
	Student(int id,String name,int age)
	{
		super(name,age);
		studentId=id;
	}
	
	public void displayStudentDetail()
	{
		System.out.println(studentId);
	}
	
	public void setStudentId(int studentId)
	{
		this.studentId=studentId;
	}
	
	public int getStudentId()
	{
		return studentId;
	}
	
	public void display()
	{
		System.out.println(this.studentId+" "+super.getAge()+" "+super.getName());
	}

}
