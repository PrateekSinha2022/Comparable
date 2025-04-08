package Stack;
import java.util.*;

public class Stack {
	
	private int[] data;
	private int pointer=-1;
	final private int initial_capacity=10;
	
	Stack()
	{
		data=new int[initial_capacity];
	}
	
	public boolean push(int value)
	{
		if(isFull())
		{
			data=Arrays.copyOf(data,data.length*2);
		}
		pointer++;
		data[pointer]=value;
		return true;
	}
	
	public void pop()
	{
		if(isEmpty())
		{
			throw new EmptyStack();
		}
		System.out.println(data[pointer]);
		pointer--;
	}
	
	public boolean isFull()
	{
		if(pointer==data.length-1)
			return true;
		return false;
	}
	public void peep()
	{
		if(isEmpty())
			throw new EmptyStack();
		else
		{
			System.out.println(data[pointer]);
		}
	}
	
	public boolean isEmpty()
	{
		return pointer==-1;
	}
	
	public void display()
	{
		for(int i=0;i<=pointer;i++)
		{
			System.out.print(data[i]+" ");
		}
	}

}
