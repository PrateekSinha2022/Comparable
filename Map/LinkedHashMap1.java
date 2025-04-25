package Map;
import java.util.*;
public class LinkedHashMap1 {
	
	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> h  = new LinkedHashMap<Integer,String>();
		h.put(1, "KOL");
		h.put(3, "ihi");
		h.put(2, "lok");
		System.out.println(h);
	}

}
