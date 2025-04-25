package Map;

import java.util.*;
public class Hashmap {
	
	public static void main(String[] args) {
		
		Map<Integer,Student> h = new HashMap<Integer,Student>();
		
		h.put(1, new Student(1,35.2));
		h.put(3, new Student(2,36.9));
		
		Set<Integer> key_set = h.keySet();
		for(int key:key_set)
		{
			System.out.println(key+"\t"+h.get(key));
		}
		
	}

}
