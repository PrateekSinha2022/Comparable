package oops;

public class Driver {
	public static void main(String[] args) {
		Laptop l=new Laptop("hp",57000,8);
		System.out.println(l.brand+","+l.price+","+l.ram);
		
		Laptop l2=new Laptop("dell",60000,9);
		System.out.println(l2.brand+","+l2.price+","+l2.ram);
	}

}
