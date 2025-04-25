package Set;

public class Book implements Comparable<Book>{
	
	private int id;
	private double price;
	private String title;
	
	public void setTitle(String title)
	{
		this.title=title;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public int getId()
	{
		return id;
	}
	public String getTitle()
	{
		return title;
	}
	public double getPrice()
	{
		return price;
	}
	public Book(int id, double price, String title) {
		super();
		this.id = id;
		this.price = price;
		this.title = title;
	}
	@Override
	public String toString()
	{
		return "["+this.id+" "+this.title+" "+this.price+"]";
	}
	
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		
		return this.title.compareTo(o.title);
	}
	

}
