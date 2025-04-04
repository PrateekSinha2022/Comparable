package Arrays;

public class New_Array {
	public static void main(String[] args) {
		int[][] arr= {{1,4,5},{2,7},{8,9,3}};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]%2==0)
					sum+=arr[i][j];
			}
		}
		System.out.println(sum);
	}

}
