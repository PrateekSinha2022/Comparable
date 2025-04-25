package Set;
import java.util.*;

public class SortByPrice implements Comparator<Book>{
	@Override
	public int compare(Book a,Book b)
	{
		return Double.compare(a.getPrice(), b.getPrice());
	}

}
