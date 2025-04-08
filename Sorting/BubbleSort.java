package Sorting;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		 
		int arr[]= {2,5,3,1,4,0};
		
		int i,j;
		boolean swapped=false;
		
		for(i=0;i<arr.length-1;i++)
		{
			swapped=false;
			for(j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					swapped=true;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if(!swapped)
				break;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
