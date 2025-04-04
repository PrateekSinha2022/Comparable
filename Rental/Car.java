package Rental;

public class Car extends Vehicle{
	
	private int noOfDoors;
	
	Car(String vehicleNumber,String brand,String model,double rentalPricePerDay,boolean isAvailable,int noOfDoors)
	{
		super(vehicleNumber,brand,model,rentalPricePerDay,isAvailable);
		this.noOfDoors=noOfDoors;
	}
	
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println(noOfDoors);
	}

}
