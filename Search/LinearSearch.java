package Search;

import java.util.Scanner;
import java.util.*;

public class LinearSearch {
	
	public static int[] find(int [][]arr,int n)
	{
		int a[]=new int[2];
		a[0]=-1;
		a[1]=-1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]==n)
				{
					a[0]=i;
					a[1]=j;
					return a;
				}
			}
		}
		return a;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int r[]=find(arr,n);
		
		System.out.println(Arrays.toString(r));
	}

}
