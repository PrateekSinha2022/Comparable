package Rental;

public class Driver {
	
	public static void main(String[] args) {
		
		Bike bike = new Bike("125412","honda","cb18",500,true,true);
		
		bike.displayDetails();
		
		Car car = new Car("5848","bmw","x3",10000,false,4);
		
		car.displayDetails();
		
		bike.rentVehicle();
		car.rentVehicle();
	}

}
