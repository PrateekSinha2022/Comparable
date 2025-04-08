package Sorting;
import java.util.*;
public class InsertionSort {
	
	public static void main(String[] args) {
		
		int arr[]= {7,5,3,1,4,0};
		
		int i,j,key;
		for(i=1;i<arr.length;i++)
		{
			key=arr[i];
			j=i-1;
			
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		System.out.println(Arrays.toString(arr));
	}

}
