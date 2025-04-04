package Abstraction;

public class Driver {
public static void main(String[] args) {
	
	Calci c = new CalciImp();
	System.out.println(c.add(5, 5));
	System.out.println(c.sub(5, 1));
}
}
