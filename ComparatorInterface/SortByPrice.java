package ComparatorInterface;
import java.util.*;
public class SortByPrice implements Comparator<Book>{
	
	
	public int compare(Book a,Book b)
	{
		return Double.compare(a.price, b.price);
	}
	
	

}
