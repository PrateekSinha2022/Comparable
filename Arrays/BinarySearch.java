package Arrays;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr= {1,2,9,13,58};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no to be searched");
		int n=sc.nextInt();
		
		int start=0,end=arr.length-1,k=-1;
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			//System.out.println(mid);
			if(arr[mid]>n)
				end=mid-1;
			else if(arr[mid]<n)
				start=mid+1;
			else if(arr[mid]==n)
			{
				k=1;
				break;
			}
		}
		System.out.println(arr[-1]);
	}

}
