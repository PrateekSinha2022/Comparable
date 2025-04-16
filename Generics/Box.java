package Generics;

public class Box<T> {
	
	private T value;
	
	Box(T value)
	{
		this.value=value;
	}
	
	
	public T getValue()
	{
		return this.value;
	}
	public static void main(String[] args) {
		Box<Integer> b1= new Box<Integer>(10);
		Box<?> b2=b1;
		Box<? extends Object> b3=b1;
		Box<? super Number> b4 = b1;
	}

}
