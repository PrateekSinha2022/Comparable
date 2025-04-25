package StreamApi;
import java.util.*;
public class Str {
	
	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("apple","banana","cherry");
		
		String l=list.stream().filter(s->s.charAt(0)=='a').findFirst().get();
		System.out.println(l);
	}

}
