package Lambda;
import java.util.*;
public class Class {
	public static void main(String[] args) {
		
		//List<String> list= Arrays.asList("app","ball","crow","dung");
		
		//Collections.sort(list,(s1,s2)->s1.length()-s2.length());
		
		//list.forEach(t -> System.out.println(t));
		
		List<Double> l = Arrays.asList(20.3,52.1,10.3);
		Collections.sort(l,(a,b)->Double.compare(b, a));
		l.forEach(t->System.out.println(t));
	}

}
