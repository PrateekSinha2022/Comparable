package Composition;

public class House {
	private String color;
	private Room room;
	
	House(String color,double area)
	{
		this.color=color;
		room=new Room(area);
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public Room getRoom()
	{
		return room;
	}

}
