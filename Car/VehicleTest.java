package Car;

public class VehicleTest {
	
	public static void main(String[] args) {
		
		AbstractVehicle car=new CarClass("bmw",100);
		AbstractVehicle bike=new BikeClass("hero",50);
		AbstractVehicle truck=new TruckClass("tata",80);
		
		car.displayDetails();
		truck.displayDetails();
		bike.displayDetails();
		
		car.accelerate(20);
		System.out.println(car.getCurrentSpeed());
		car.start();
	}
	
	

}
