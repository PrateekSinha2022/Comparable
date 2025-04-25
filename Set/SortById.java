package Set;
import java.util.*;
public class SortById implements Comparator<Book>{
	@Override
	public int compare(Book a,Book b)
	{
		return a.getId()-b.getId();
	}

}
