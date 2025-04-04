package clas;

public class NegArray {
	
	/*public static int findSum(int[] arr,int start,int end)
	{
		int count=0;
		int sum=0;
		while(start>=0 && end<arr.length)
		{
			for(int i=start;i<end;i++)
			{
				sum+=arr[i];
			}
			if(sum<0)
			{
				start--;
				count++;
				end++;
			}
		}
		
		
		return count;
	}*/
	
	public static void main(String[] args) {
		
		int arr[] = {-1,2,-3,4,-5};
		
		int i=0,count=0;
		
		for(i=0;i<arr.length;i++)
		{
			int sum=0;
			/*count+=findSum(arr,i,i);
			count+=findSum(arr,i,i+1);*/
			for(int j=i;j<arr.length;j++)
			{
				sum+=arr[j];
				if(sum<0)
					count++;
			}
			//System.out.println(sum);
			
		}
		
		System.out.println(count);
	}

}
