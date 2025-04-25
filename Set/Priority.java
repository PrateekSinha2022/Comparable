package Set;

import java.util.PriorityQueue;

public class Priority {
	
	public static void main(String[] args) {
		
		SortByPrice s = new SortByPrice();
		PriorityQueue<Book> t=new PriorityQueue<Book>(s);
		t.add(new Book(1, 420, "Shake"));
		t.add(new Book(2, 500, "junglebook"));
		t.add(new Book(3, 20, "lon"));
		while(!t.isEmpty())
		{
			System.out.print(t.poll()+" ");
		}
	}

}
