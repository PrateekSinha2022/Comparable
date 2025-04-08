package Doubly;

public class DoublyLL {
	
	private Node head,tail;
	private int size;
	
	class Node
	{
		int value;
		Node prev;
		Node next;
		
		Node(int value)
		{
			this.value=value;
		}
	}
	
	public boolean isEmpty()
	{
		return head==null && tail==null;
	}
	
	public boolean append(int value)
	{
		Node node=new Node(value);
		if(isEmpty())
		{
			head=node;
			tail=node;
			tail.next=null;
			tail.prev=null;
		}
		else
		{
			tail.next=node;
			node.prev=tail;
			tail=tail.next;
			node.next=null;
		}
		size++;
		//tail=tail.next;
		return true;
	}
	
	public void display()
	{
		StringBuilder sb=new StringBuilder("[");
		Node temp=head;
		
		while(temp!=null)
		{
			sb.append(temp!=tail?temp.value+",":temp.value);
			temp=temp.next;
		}
		sb.append("]");
		System.out.println(sb);
		
	}
	
	public boolean preappend(int value)
	{
		Node node=new Node(value);
		if(isEmpty())
		{
			head=node;
			tail=node;
			tail.next=null;
			tail.prev=null;
		}
		else
		{
			node.next=head;
			node.prev=null;
			head.prev=node;
			head=node;
		}
		size++;
		return true;
	}
	
	public boolean insert(int pos,int val)
	{
		if(pos==0)
		{
			this.preappend(val);
		}
		else if(pos==size)
		{
			this.append(val);
		}
		else
		{
			Node node=new Node(val);
			Node temp=head;
			int c=0;
			while(c<pos-1)
			{
				temp=temp.next;
				c++;
			}
			node.next=temp.next;
			temp.next.prev=node;
			temp.next=node;
			node.prev=temp;
		}
		size++;
		return true;
	}
	
	public boolean deleteAtFirst()
	{
		if(size==1)
		{
			head=null;
			tail=null;
		}
		else
		{
			head=head.next;
			head.prev=null;
		}
		size--;
		return true;
	}
	
	public void deleteLast()
	{
		Node temp=head;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp.next=null;
		tail=temp;
		size--;
	}
	
	public void delete(int pos)
	{
		if(pos==0)
			deleteAtFirst();
		else if(pos==size-1)
			deleteLast();
		else
		{
			int c=0;
			Node temp=head;
			while(c<pos-1)
			{
				c++;
				temp=temp.next;
			}
			temp.next.next.prev=temp;
			temp.next=temp.next.next;
			size--;
		}
	}
	
	public int search(int value)
	{
		int res=-1;
		Node temp=head;
		while(temp!=null)
		{
			if(temp.value==value)
				return 1;
			temp=temp.next;
			
		}
		return -1;
	}
	
	public void update(int pos,int value)
	{
		Node temp=head;
		int c=0;
		while(temp!=null)
		{
			if(c==pos)
			{
				temp.value=value;
				break;
			}
			temp=temp.next;
			c++;
				
		}
	}
	
	public void displayrev()
	{
		StringBuilder sb=new StringBuilder("[");
		Node temp=tail;
		while(temp!=null)
		{
			sb.append(temp==head?temp.value:temp.value+",");
			temp=temp.prev;
		}
		sb.append("]");
		System.out.println(sb);
	}
	
}
