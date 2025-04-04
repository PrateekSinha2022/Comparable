package ComparatorInterface;

public class Book implements Comparable<Book>{
	
	int id;
	String title;
	double price;
	
	Book(int id,String title,double price)
	{
		this.id=id;
		this.title=title;
		this.price=price;
	}
	@Override
	public int compareTo(Book b)
	{
		return this.id-b.id;
	}
	@Override
	public String toString()
	{
		return id+" "+title+" "+price;
	}

}
