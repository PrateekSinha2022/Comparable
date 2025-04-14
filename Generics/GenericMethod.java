package Generics;

public class GenericMethod {
	
	static public <T> void printArray(T[] arr)//before return type generic is declared to use it locally
	{
		for(T i:arr)
		{
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		
		Double[] arr= {1.0,2.0,3.0,4.2};
		printArray(arr);
	}

}
