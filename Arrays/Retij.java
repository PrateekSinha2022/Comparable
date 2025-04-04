package Arrays;
import java.util.*;
public class Retij {
	public static int[][] find(int[][] arr)
	{
		int ma=0;
		int[][] ar=new int[1][2];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(ma<arr[i][j])
				{
					ma=arr[i][j];
					ar[0][0]=i;
					ar[0][1]=j;
				}
					
			}
		}
		return ar;
		
	}
	public static void main(String[] args) {
		int[][] arr= {{1,4,5},{2,7},{8,9,3}};
		int[][] res=new int[1][2];
		res=find(arr);
		System.out.println(Arrays.toString(res[0]));
	}

}
