package Ll;

public class Cll {
	
	private class Node
	{
		int value;
		Node next;
		Node(int value)
		{
			this.value=value;
		}
		
	}
	private Node head=null;
	private Node tail=null;
	private int size=0;
	
	public void append(int value)
	{
		Node node=new Node(value);
		if(isEmpty())
		{
			head=node;
			tail=node;
		}
		else
		{
			tail.next=node;
			tail=tail.next;
		}
		tail.next=head;
		size++;
	}
	
	public boolean isEmpty()
	{
		return head==null && tail==null;
	}
	public void display()
	{
		Node temp = head;
		StringBuffer sb=new StringBuffer("[");
		if(isEmpty())
			return;
		do
		{
			sb.append(temp!=tail?temp.value+",":temp.value);
			temp=temp.next;
		}while(temp!=head);
		sb.append("]");
		System.out.println(sb);
		
	}
	
	public void prepend(int value)
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
		tail.next=node;
		size++;
	}
	
	public void addLast(int value)
	{
		Node node=new Node(value);
		if(isEmpty())
		{
			head=node;
			tail=node;
		}
		else
		{
			tail.next=node;
			tail=tail.next;
		}
		tail.next=head;
		size++;
	}
	
	public void insert(int pos,int value)
	{
		if(size==pos)
		{
			this.addLast(value);
			return;
		}
		
		else if(isEmpty())
		{
			Node node=new Node(value);
			head=node;
			tail=node;
			tail.next=head;
		}
		else
		{
			Node node=new Node(value);
			Node temp=head;
			int c=0;
			while(c<pos-1)
			{
				temp=temp.next;
				c++;
			}
			node.next=temp.next;
			temp.next=node;
		}
	}
	
	public void update(int pos,int val)
	{
		int size=0;
		Node temp=head;
		while(size<val)
		{
			temp=temp.next;
			size++;
		}
		
		temp.value=val;
	}
	
	public void deleteFirt()
	{
		if(size==0)
		{
			head=null;
			tail=null;
		}
		else
		{
			head=head.next;
			tail.next=head;
		}
		size--;
	}
	
	public void deleteLast()
	{
		if(size==1)
		{
			this.deleteFirt();
			return;
		}
		else
		{
			int c=0;
			Node temp=head;
			while(temp.next!=tail)
			{
				temp=temp.next;
			}
			tail=temp;
			tail.next=head;
		}
		size--;
	}
	
	public void deletePos(int pos)
	{
		Node temp=head;
		int c=0;
		if(pos==0)
		{
			this.deleteFirt();
			return;
		}
		else if(pos==size-1)
		{
			this.deleteLast();
			return;
		}
		while(c<pos-1)
		{
			temp=temp.next;
			c++;
		}
		temp.next=temp.next.next;
		size--;
	}
	
	public boolean search(int value)
	{
		Node temp=head;
		while(temp!=tail)
		{
			temp=temp.next;
			if(temp.value==value)
				return true;
		}
		return false;
	}
	
	public void reverse()
	{
		Node next=null,prev=tail,n=tail;
		Node current=head;
		tail=head;
		do
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current =next;
		}while(current!=head);
		head=prev;
	}

}
