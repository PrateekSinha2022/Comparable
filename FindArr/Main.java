package FindArr;

import java.util.Scanner;

public class Main {
	
	static int update=5;
	
	public static int[][] makeZero(int i,int j,int[][] arr)
	{
		int i1,j1;
		
		for(i1=0;i1<arr[0].length;i1++)
		{
			arr[i][i1]=0;
		}
		for(j1=0;j1<arr.length;j1++)
		{
			arr[j1][j]=0;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt();
		int c = sc.nextInt();
		
		int arr[][]=new int[r][c];
		int i,j;
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt()+update;
			}
		}
		
		for(int i1=0;i1<r;i1++)
		{
			for(int j1=0;j1<c;j1++) 
			{
				if(arr[i1][j1]==update)
					arr=makeZero(i1,j1,arr);
			}
		}
		
		for(int i3=0;i3<r;i3++)
		{
			for(int j3=0;j3<c;j3++)
			{
				if(arr[i3][j3]!=0)
					arr[i3][j3]-=update;
			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
