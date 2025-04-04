package Arrays;
import java.util.*;
public class Maxi {
	public static void main(String[] args) {
		int[][] arr= {{1,4,5},{2,7},{8,4,3}};
		int ma=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(ma<arr[i][j])
					ma=arr[i][j];
			}
		}
		System.out.println(ma);
	}

}
