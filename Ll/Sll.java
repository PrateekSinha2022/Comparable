package Ll;

public class Sll {
	
	private class Node
	{
		int value;
		Node next;
		Node(int value)
		{
			this.value=value;
		}
	}
	
	public boolean apppend(int value)
	{
		Node node = new Node(value);
		
		if(isEmpty())
		{
			head=node;
			tail=node;
		}
		else
		{
			tail.next=node;
			tail=node;
		}
		size++;
		return true;
	}
	
	public boolean prepend(int value)
	{
		Node node=new Node(value);
		if(isEmpty())
		{
			head=node;
			tail=node;
		}
		else
		{
			node.next=head;
			head=node;
		}
		size++;
		return true;
	}
	
	public boolean insert(int value,int pos)
	{
		Node node=new Node(value);
		int count=0;
		Node temp=head;
		while(count<pos-1)
		{
			count++;
			temp=temp.next;
		}
		node.next=temp.next;
		temp.next=node;
		size++;
		return true;
	}
	
	public void display()
	{
		Node temp = head;
		StringBuffer sb=new StringBuffer("[");
		while(temp!=null)
		{
			sb.append(temp==tail?temp.value:temp.value+",");
			temp=temp.next;
		}
		sb.append("]");
		System.out.println(sb);
		
	}
	public boolean deleteFirst()
	{
		if(head==null)
			return false;
		if(head==tail)
		{
			head=null;
			tail=null;
		}
		else
		{
			head=head.next;
			
		}
		size--;
		
		return true;
	}
	
	public boolean deleteLast()
	{
		if(head==null)
			return false;
		if(head==tail)
		{
			head=null;
			tail=null;
		}
		else
		{
			Node temp=head;
			while(temp.next!=tail)
			{
				temp=temp.next;
			}
			temp.next=null;
			tail=temp;
			size--;
			
		}
		return true;
	}
	public void update(int pos,int value)
	{
		int c=0;
		Node temp=head;
		while(c!=pos)
		{
			c++;
			temp=temp.next;
			
		}
		temp.value=value;
	}
	
	public int search(int val)
	{
		Node temp=head;
		int c=0;
		while(temp!=null)
		{
			if(temp.value==val)
				return c;
			c++;
			temp=temp.next;
		}
		return -1;
	}
	
	public boolean deleteIndex(int pos)
	{
		Node temp=head;
		int count=0;
		
		while(count<pos-1)
		{
			temp=temp.next;
			count++;
		}
		temp.next=temp.next.next;
		size--;
		return true;
	}
	
	public boolean isEmpty()
	{
		return head==null && tail==null;
	}
	
	private Node head,tail;
	private int size=0;
	
	public int getSize()
	{
		return size;
	}
	
	public boolean reverse()
	{
		Node next=null,prev=null;
		Node current=head;
		tail=head;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
		
		return true;
		
	}

}
