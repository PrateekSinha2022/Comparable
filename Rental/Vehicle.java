package Rental;

public class Vehicle {
	
	private String vehicleNumber,brand,model;
	private double rentalPricePerDay;
	private boolean isAvailable;
	
	Vehicle(String vehicleNumber,String brand,String model,double rentalPricePerDay,boolean isAvailable)
	{
		this.vehicleNumber=vehicleNumber;
		this.brand=brand;
		this.model=model;
		this.rentalPricePerDay=rentalPricePerDay;
		this.isAvailable=isAvailable;
	}
	
	public void displayDetails()
	{
		System.out.println(vehicleNumber);
		System.out.println(brand);
		System.out.println(model);
		System.out.println(rentalPricePerDay);
		System.out.println(isAvailable);
	}
	
	public void rentVehicle()
	{
		if(this.isAvailable==true)
			System.out.println("Available for rent");
		else
			System.out.println("Not available for rent");
	}
	

}
