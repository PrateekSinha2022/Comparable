package Generics;

public class Driver {
	
	public static void main(String[] args) {
		
		Box<Integer> b1=new Box<>(10);
		int value=b1.getValue();
		System.out.println(value);
		
		
		Box<Double> b2=new Box<>(10.0);
		System.out.println(b2.getValue());
		
	}
	
	

}
