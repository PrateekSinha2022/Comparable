package Car;

public class AbstractVehicle implements Vehicle {
	
	protected String name;
	protected int speed;
	
	AbstractVehicle(String name,int speed)
	{
		this.name=name;
		this.speed=speed;
	}
	public void displayDetails()
	{
		System.out.println(name);
		System.out.println(speed);
	}
	@Override
	public void accelerate(int increment)
	{
		speed+=increment;
	}
	@Override
	public void brake(int decrement)
	{
		speed-=decrement;
	}
	@Override
	public int getCurrentSpeed()
	{
		return this.speed;
	}
	
	public void displayType()
	{
		
	}
	
	@Override
	public void start()
	{
		System.out.println(this.name+" has started");
	}
	@Override
	public void stop()
	{
		System.out.println(this.name+" has stopped");
	}

}
