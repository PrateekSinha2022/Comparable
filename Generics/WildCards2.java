package Generics;

import java.util.LinkedList;

public class WildCards2 {
	
	public static void printLinkedList(LinkedList<?> list)
	{
		// list.add(10) is not possible here as <?> does not know what is the data type
		for(Object i:list)
		{
			System.out.print(i+" ");
		}
		Object i=list.get(0);
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> list1=new LinkedList<Integer>();
		
		list1.add(10);
		list1.add(20);
		printLinkedList(list1);
	}

}
