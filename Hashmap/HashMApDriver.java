package Hashmap;

public class HashMApDriver {
	
	public static void main(String[] args) {
		
		HashMap h=new HashMap();
		h.put(1, "Teacher");
		h.put(2, "Student");
		h.put(4, "lor");
		h.put(2, "kol");
		h.display();
		System.out.println(h.size());
		System.out.println(h.get(2));
		System.out.println(h.containsKey(3));
	}

}
