package Obje;

import java.util.Objects;

public class Studenty {
	
	private String name;
	private int age;
	private double percentage;
	
	Studenty(String name,int age,double percentage)
	{
		this.name=name;
		this.age=age;
		this.percentage=percentage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	} 
	@Override
	public String toString()
	{
		return this.name+" "+this.age+" "+this.percentage;
	}
	@Override
	public boolean equals(Object obj)
	{
		
		Studenty s = (Studenty)obj;
		
		return this.name.equals(s.name) && this.age==s.age  && this.percentage==s.percentage;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(this.name,this.age,this.percentage);
	}
}
