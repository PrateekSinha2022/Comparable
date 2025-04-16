package Generics;

import java.util.LinkedList;

public class WildCards2 {
	
	public static void printLinkedList(LinkedList<?> list)//if i make <? extends Number> we still cannot add data
	{
		// list.add(10) is not possible here as <?> does not know what is the data type
		
		//list.add(10) allowed when we make <? super Integer> but data return type will be OBJECT
		for(Object i:list)
		{
			System.out.print(i+" ");
		}
		Object i=list.get(0);//if i make <? extends Number> data returned will be Number type
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> list1=new LinkedList<Integer>();
		
		list1.add(10);
		list1.add(20);
		printLinkedList(list1);
	}

}
