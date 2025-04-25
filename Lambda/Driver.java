
package Lambda;

import java.util.*;

public class Driver {
	
	public static void main(String[] args) {
		
		//Operation o = Calci::add;//method reference
		//System.out.println(o.operate(10, 20));
		
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		Collections.sort(list,Integer::compareTo);
		 Operation o1=Calci::new;
		 o1.operate();
		
		list.forEach(System.out::println);
	}

}
