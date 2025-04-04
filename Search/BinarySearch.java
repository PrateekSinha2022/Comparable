package Search;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int mid,low=0,high=arr.length-1;
		int k=1,find=-1;
		
		while(low<=high)
		{
			mid=low+(high-low)/2;
			
			if(k>arr[mid])
				low=mid+1;
			else if(k<arr[mid])
				high=mid-1;
			else if(k==arr[mid])
			{
				find=mid;
				System.out.println(find);
				break;
			}
		}
		
		if(find==-1)
			System.out.println("not found");
	}

}
