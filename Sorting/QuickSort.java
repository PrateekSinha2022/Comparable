package Sorting;

import java.util.Arrays;

public class QuickSort {
	
	private static int patition(int[] arr,int pivot,int end_index)
	{
		int swap=pivot;
		int index=pivot;
		
		while(index<=end_index)
		{
			if(arr[index]<arr[pivot])
			{
				swap++;
				int temp=arr[swap];
				arr[swap]=arr[index];
				arr[index]=temp;
			}
			index++;
		}
		int temp=arr[pivot];
		arr[pivot]=arr[swap];
		arr[swap]=temp;
		return swap;
	}
	
	public static void quicksort(int[] arr,int start,int end)
	{
		if(start<end)
		{
			int pivot=patition(arr, start, end);
			quicksort(arr, start, pivot-1);
			quicksort(arr, pivot+1, end);
		}
	}
	public static void main(String[] args) {
		int []arr= {5,4,3,2,1};
		quicksort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
