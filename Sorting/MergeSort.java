package Sorting;

import java.util.Arrays;

public class MergeSort {
	
	public static void merge(int []arr,int start,int mid,int end)
	{
		int leftArrayLength = mid-start+1;
		int rightArrayLength = end-mid;
		
		int leftArray[] = new int[leftArrayLength];
		int rightArray[] = new int[rightArrayLength];
		
		int i;
		for(i=0;i<leftArrayLength;i++)
		{
			leftArray[i]=arr[start+i];
		}
		for(i=0;i<rightArrayLength;i++)
		{
			rightArray[i]=arr[mid+1+i];
		}
		
		i=0;
		int j=0,k=start;
		
		while(i<leftArrayLength && j<rightArrayLength)
		{
			if(leftArray[i]<rightArray[j])
			{
				arr[k++]=leftArray[i++];
			}
			else
			{
				arr[k++]=rightArray[j++];
			}
		}
		while(i<leftArrayLength)
		{
			arr[k++]=leftArray[i++];
		}
		while(j<rightArrayLength)
		{
			arr[k++]=rightArray[j++];
		}
	}
	
	public static void mergesort(int []arr,int left,int right)
	{
		if(left<right)
		{
			int mid=left+(right-left)/2;
			mergesort(arr,left,mid);
			mergesort(arr, mid+1, right);
			
			merge(arr,left,mid,right);
		}
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,5,9,4,2,3,4};
		mergesort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
;	}

}
