package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		
		Set<Integer> h = new LinkedHashSet<Integer>();
		h.add(10);
		h.add(20);
		h.add(30);
		System.out.println(h);
	}

}
