package Queue;

import Ll.Sll;

public class QueueLL {
	
	private Sll data;
	private int pointer=-1;
	
	public QueueLL()
	{
		data=new Sll();
	}
	
	public boolean insert(int value)
	{
		pointer++;
		return data.apppend(value);
		
				
	}
	public int delete()

	{
		int temp=data.get(0);
		data.deleteFirst();
		pointer--;
		return temp;
	}
	
	public int size()
	{
		return pointer+1;
	}
	
	public void display()
	{
		data.display();
	}
}
