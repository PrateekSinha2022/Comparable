package uem_4;

public class CalculatorNew {
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static int sub(int a,int b,int c)
	{
		return a-b-c;
	}
	public static int mult(int a,int b,int c)
	{
		return a*b*c;
	}
	public static int mult(int a,int b)
	{
		return a*b;
	}
	public static int sub(int a,char c)
	{
		return a-c;
	}
	public static int mult(int a,char c)
	{
		return a*c;
	}
	public static void main(String[] args) {
		System.out.println(mult(5,'c'));
	}

}
