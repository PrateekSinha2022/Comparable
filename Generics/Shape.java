package Generics;

public class Shape<K extends Number,V> //Can create restrictions e.g allowing only child of number class we can write as K extends Number
{
	
	private K key;
	private V value;
	
	Shape(K key,V value)
	{
		this.key=key;
		this.value=value;
	}
	
	K getKey()
	{
		return key;
	}
	
	V getValue()
	{
		return value;
	}

}
