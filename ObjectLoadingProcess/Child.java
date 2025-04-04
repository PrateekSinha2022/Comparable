package ObjectLoadingProcess;

public class Child extends Parent {
	int grade;
	String name;	
	
	
	public void display()
	{
		System.out.println(this.name+" "+super.name);
	}

}
