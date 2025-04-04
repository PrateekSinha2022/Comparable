package Arrays;
import java.util.*;
public class Floor {
	public static int floorSearch(int[] arr,int n)
	{
		int start=0,end=arr.length-1,mid;
		while(start<=end)
		{
			mid=start+(end-start)/2;
			if(n>arr[mid])
			{
				start=mid+1;
			}
			else if(n<arr[mid])
				end=mid-1;
			else if(arr[mid]==n)
				return mid;
		}
		return end;
	}
	public static void main(String[] args) {
		int[] arr= {2,5,7,9,12,23,42};
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(floorSearch(arr,n));
	}

}
