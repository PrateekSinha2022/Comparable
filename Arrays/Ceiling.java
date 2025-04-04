package Arrays;
import java.util.*;

public class Ceiling {
	public int findPos(int[] arr,int n)
	{
		int low=0,high=arr.length-1,mid=0;
		while(low<=high)
		{
			
			mid=low+(high-low)/2;
			//System.out.println(mid);
			if(arr[mid]>n)
				high=mid-1;
			else if(arr[mid]<n)
				low=mid+1;
			else if(n==arr[mid])
				return mid;
		}
		return low;
	}
	public int find(int[] arr,int n)
	{
		
		for(int i =0;i<arr.length;i++)
		{
			if(n<arr[i])
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {2,5,7,9,12,23,40};
		Arrays.sort(arr);
		/*System.out.println(Arrays.toString(arr));*/
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a no");
		int n =sc.nextInt();
		Ceiling ob = new Ceiling();
		int result = ob.findPos(arr,n);
		System.out.println(result);
		
	}

}
