package Hashmap;

import java.util.LinkedList;
import java.util.Objects;

public class HashMap {
	
	private LinkedList<Node>[]  buckets;//Always use the generic<Node>
	private int n;//no of nodes
	private int N;//no of buckets
	
	public HashMap()
	{
		N=4;
		buckets=new LinkedList[N];
		for(int i=0;i<N;i++)
		{
			buckets[i]=new LinkedList();
		}
	}
	
	public void put(int key,String value)
	{
		int bi = hashFunction(key);
		int di  = getDataIndex(bi,key);
		
		if(di!=-1)
		{
			buckets[bi].get(di).value=value;
		}
		else
		{
			buckets[bi].add(new Node(key,value));
			n++;
		}
		
		double lambda = (double) n/N;
		
		if(lambda>2.0)
		{
			rehash();
		}
	}
	
	private void rehash()
	{
		LinkedList<Node>[] old=buckets;
		buckets = new LinkedList[N*2];
		N=buckets.length;
		n=0;
		
		for(int i=0;i<buckets.length;i++)
		{
			buckets[i]=new LinkedList<>();
		}
		
		for(int i=0;i<old.length;i++)
		{
			LinkedList<Node> list=old[i];
			for(int j=0;j<list.size();j++)
			{
				Node node=list.get(j);
				put(node.key,node.value);
			}
		}
	}
	
	private int hashFunction(int key)
	{
		int hashcode=Objects.hash(key);
		hashcode=Math.abs(hashcode);
		return hashcode%buckets.length;
		
	}
	
	private int getDataIndex(int bi,int key)

	{
		LinkedList<Node> list=buckets[bi];
		for(int i=0;i<list.size();i++)
		{
			Node node=list.get(i);
			if(node.key==key)
			{
				return i;
			}
		}
		return -1;
	}
	
	public void display()
	{
		for(int i=0;i<buckets.length;i++)
		{
			LinkedList<Node> l=buckets[i];
			for(int j=0;j<l.size();j++)
			{
				Node node=l.get(j);
				System.out.println(node.key+":"+node.value);
			}
		}
	}
	
	public int size()
	{
		return n;
	}
	
	public String get(int key)
	{
		int bi = hashFunction(key);
		int di  = getDataIndex(bi,key);
		if(di==-1)
			return null;
		else
			return buckets[bi].get(di).value;
	}
	
	public boolean containsKey(int key)
	{
		int bi = hashFunction(key);
		int di  = getDataIndex(bi,key);
		if(di==-1)
			return false;
		else
			return true;
	}
	
	private class Node
	{
		int key;
		String value;
		Node(int key,String value)

		{
			this.key=key;
			this.value=value;
		}
	}

}
