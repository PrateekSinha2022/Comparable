package EvenDigits;

public class FindEven {
	
	public int find(int n)
	{
		int c=0;
		while(n>0)
		{
			c++;
			n/=10;
		}
		return c;
	}
	
	public void result(int []arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			int res=find(arr[i]);
			if(res%2==0)
				count++;
		}
		System.out.println(count);
	}

}
