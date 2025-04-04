package Classwork;

public class MaxSum {
	
	public static void main(String[] args) {
		
		int sum=0;
		int max_sum=-9999;
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		
		int i,j;
		
		for(i=0;i<arr.length;i++)
		{
			sum=0;
			for(j=i;j<arr.length;j++)
			{
				sum+=arr[j];
				if(max_sum<sum)
					max_sum=sum;
			}
		}
		System.out.println(max_sum);
	}
	
	/*public int find(int []arr,int start,int end,int maxi)
	{
		if(end==arr.length)
			return maxi;
		else
		{
			int sum=0;
			for(int i=start;i<=end;i++)
			{
				sum+=arr[i];
			}
			if(maxi>sum)
				maxi=sum;
			start++;
			end
		}
	}*/

}
