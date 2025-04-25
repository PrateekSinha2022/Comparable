package Set;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private double percentage;
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPercentage()
	{
		return percentage;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setPercentage(double percentage)
	{
		this.percentage=percentage;
	}

	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	
	@Override
	public String toString()
	{
		return "["+this.id+" "+this.name+" "+this.percentage+"]";
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(id,name,percentage);
	}
	
	@Override
	public boolean equals(Object o)
	{
		Student s=(Student)o;
		
		return this.id==s.id&&this.name.equals(s.name)&&this.percentage==s.percentage;
	}

}
