package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class tDArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row and column size");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] arr=new int[r][];
		arr[0]=new int[c];
		arr[1]=new int[] {2,4,5};
		for(int[] a:arr)
		{
			System.out.println(Arrays.toString(a));
		}
		

}
}