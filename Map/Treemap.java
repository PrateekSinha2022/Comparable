package Map;
import java.util.*;

public class Treemap {
	
	public static void main(String[] args) {
		
		TreeMap<Integer,Student> h = new TreeMap<Integer,Student>();
		h.put(1, new Student(1,35.2));
		h.put(3, new Student(2,36.9));
		System.out.println(h);
		System.out.println(h.get(3));
	}

}
