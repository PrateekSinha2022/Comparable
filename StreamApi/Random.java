package StreamApi;
import java.util.*;
import java.util.stream.Collectors;

public class Random {
	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,5,4,20,19);
		List<String> list2=Arrays.asList("aba","jnjsj","av","ab");
		List<String> list1=new ArrayList<String>();
		
		list1=list2.stream().filter(s->s.charAt(0)=='a').toList();
		System.out.println(list1);
		
		int res = list.stream().max(Integer::compare).get();
		
		Map<Integer,List<String>> map=list2.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(map);
		System.out.println(res);
		
	}

}
