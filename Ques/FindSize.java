package Ques;
import java.util.*;

public class FindSize {
	
	public static int[] find(int []arr,int target)
	{
		int low=0,high=arr.length-1,mid;
		int start,end;
		int arr1[]= {-1,-1};
		
		while(low<=high)
		{
			mid=low+(high-low)/2;
			if(target>arr[mid])
				low=mid+1;
			else if(target<arr[mid])
				high=mid-1;
			else if(target==arr[mid])
			{
				//System.out.println(mid);
				start=mid;
				end=mid;
				/*while(arr[end]==8)
				{
					end++;
				}
				arr1[0]=start;
				arr1[1]=end;
				return arr1;*/
				while(arr[start-1]==target||arr[end+1]==target)
				{
					if(arr[start-1]==target)
						start--;
					if(arr[end+1]==target)
						end++;
				}
				arr1[0]=start;
				arr1[1]=end;
				return arr1;
			}
			
		}
		return arr1;
	}
	public static void main(String[] args) {
		
		int arr[]= {5,7,7,8,8,10};
		int res[]=find(arr,6);
		System.out.println(Arrays.toString(res));
	}

}
