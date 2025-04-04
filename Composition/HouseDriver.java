package Composition;

public class HouseDriver {
	
	public static void main(String[] args) {
		House house = new House("blue",600);
		
		System.out.println(house.getRoom().getArea());
		
		house=null;
		
		System.out.println(house.getRoom().getArea());
	}

}
