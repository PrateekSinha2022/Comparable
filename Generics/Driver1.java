package Generics;

public class Driver1 {
	public static void main(String[] args) {
		
		Shape<Double,String> s1=new Shape<>(10.2,"Black");
		Double key=s1.getKey();
		String value=s1.getValue();
		System.out.println(key+":"+value);
	}

}
