package OneToMany;

public class Class {
	
	private int grade;
	private Student[] students= new Student[10];
	
	
	public int GetGrade()
	{
		return this.grade;
	}
	
	public Student[] getStudents()
	{
		return this.students;
	}
	
	Class(int grade)
	{
		this.grade=grade;
	}

	int i=0;
	void addStudent(String name)
	{
		students[i]=new Student(name);
		i++;
	}

	public void display() {
		int j;
		for(j=0;j<this.i;j++)
		{
			System.out.println(students[j].GetName());
		}
		
	}

}
