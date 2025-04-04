package uem_4;

import java.util.Arrays;
import java.util.Scanner;

public class ZeroEnd1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		int arr[]=new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(i=0;i<n-1;i++)
		{
			if(arr[i]==0)
			{
				for(int j=i;j<n;j++)
				{
					int t=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=t;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
	//sc.close();

}
