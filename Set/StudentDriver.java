package Set;
import java.util.*;
public class StudentDriver {
	public static void main(String[] args) {
		
		HashSet<Student> h = new HashSet<Student>();
		
		h.add(new Student(1,"Josh",89));
		h.add(new Student(2,"Jam",99));
		h.add(new Student(2,"Jam",99));
		System.out.println(h);
	}

}
