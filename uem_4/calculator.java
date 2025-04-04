package uem_4;

public class calculator {
	public static double add(double a,double b)
	{
		return a+b;
	}
	public static int multiplication(double a,double b,double c)
	{
		return (int)(a*b*c);
	}
	public static void main(String[] args) {
		System.out.println("add "+add(2,4));
		System.out.println("mult "+multiplication(10.0,2.3,4.9));
	}

}
