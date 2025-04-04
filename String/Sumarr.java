package String;

public class Sumarr {
	
	public static int[] find(int []arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			arr[i]=arr[i]+arr[i-1];
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int arr[] = { 1,2,3,4};
		//int ar[] = new int[arr.length];
		
		arr=find(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
