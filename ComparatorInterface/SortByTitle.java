package ComparatorInterface;

import java.util.*;
public class SortByTitle implements Comparator<Book>{
	
	public int compare(Book a,Book b)
	{
		return a.title.compareTo(b.title);
	}

}
