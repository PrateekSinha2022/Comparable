package Stack;
import java.util.EmptyStackException;

import Ll.Sll;

public class StackUsingLL {
	private Sll list;
	private int pointer=-1;
	
	public StackUsingLL()
	{
		list=new Sll();
	}
	
	public boolean push(int value)
	{
		pointer++;
		return list.prepend(value);
	}
	
	public int pop()
	{
		if(list.isEmpty())
		{
			throw new EmptyStackException();
		}
		int data =list.get(0);
		list.deleteFirst();
		pointer--;
		return data;
	}
	
	public int peek()
	{
		if(list.isEmpty())
		{
			throw new EmptyStackException();
		}
		return list.get(pointer);
	}
	
	public void display()
	{
		list.display();
	}
	
	public static void main(String[] args) {
		
		StackUsingLL list=new StackUsingLL();
		list.push(10);
		list.push(20);
		list.push(30);
		list.display();
		System.out.println(list.pop());
		list.display();
	}

}
