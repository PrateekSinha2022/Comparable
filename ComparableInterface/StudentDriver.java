package ComparableInterface;
import java.util.*;

public class StudentDriver {
	
	public static void main(String[] args) {
		
		Student arr[] = 
			{
					new Student(1,"Bhaskar",99.99),
					new Student(3,"Bhasr",97.99),
					new Student(4,"kar",9.99),
					new Student(2,"Bkar",90.99),
			};
		Arrays.sort(arr);
		for(Student s1:arr)
		{
			System.out.println(s1);
		}
		
	}

}
