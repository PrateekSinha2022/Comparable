package ComparatorInterface;
import java.util.*;
public class BookDriver {
	
	public static void display(Book arr[])
	{
		for(Book b:arr)
		{
			System.out.println(b);
		}
	}
	
	public static void main(String[] args) {
		
		Book arr[] = 
			{
					new Book(1,"lo",98.35),
					new Book(5,"hdho",90.35),
					new Book(3,"lokgyk",8.35)
			};
		SortByPrice sbp=new SortByPrice();
		SortByTitle sbt=new SortByTitle();
		
		Arrays.sort(arr);
		display(arr);
		System.out.println();
		Arrays.sort(arr,sbp);
		display(arr);
		System.out.println();
		Arrays.sort(arr,sbt);
		display(arr);
		
		throw new InvalidInput();
		
	}

}
