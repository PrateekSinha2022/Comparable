package ManyToMany;

public class Subject {
	
	private String subject;
	
	private Student[] student = new Student[10];
	
	
	public String getName()
	{
		return this.subject;
	}
	
	Subject(String subject)
	{
		this.subject=subject;
	}
	
	public Student[] getStudents()
	{
		return student;
	}
	int i=0;
	
	void addStudent(String name)
	{
		student[i] = new Student(name);
		i++;
	}
	
	public void display() {
		int j;
		System.out.println("For subject "+this.subject);
		for(j=0;j<this.i;j++)
		{
			System.out.println(student[j].getName());
		}
		
	}
	
	

}
