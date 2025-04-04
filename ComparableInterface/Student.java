package ComparableInterface;

public class Student implements Comparable{
	
	int id;
	String name;
	double marks;
	
	Student(int id,String name,double marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	@Override
	public String toString()
	{
		return id+" "+name+" "+marks;
	}
	
	@Override
	public int compareTo(Object o)
	{
		Student s = (Student)o;
		
		return Double.compare(this.marks, s.marks);
	}

}
