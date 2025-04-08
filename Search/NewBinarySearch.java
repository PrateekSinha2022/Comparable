package Search;

import java.util.Arrays;

public class NewBinarySearch {
	
	public static int find(int[] arr,int target,boolean b)
	{
		
		int low=0,high=arr.length-1,mid=0,res=-1;
		
		while(low<=high)
		{
			mid=low+(high-low)/2;
			if(arr[mid]==target)
			{
				res=mid;
				if(b)
					high=mid-1;
				else
					low=mid+1;
			}
			else if(target>arr[mid])
			{
				
				low=mid+1;
			}
			else
				high=mid-1;
		}
		return res;
				}
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,8,8,9};
		int[] a=new int[2];
		a[0]=find(arr,10,true);
		a[1]=find(arr,10,false);
	System.out.println(Arrays.toString(a));
		
	}

}
