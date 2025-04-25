package Set;
import java.util.*;
public class BookDriver {
	public static void main(String[] args) {
		
		SortByPrice id=new SortByPrice();
		TreeSet<Book> t = new TreeSet<>(id);
		t.add(new Book(1, 420, "Shake"));
		t.add(new Book(2, 500, "junglebook"));
		t.add(new Book(3, 20, "lon"));
		System.out.println(t);
		
	}

}
