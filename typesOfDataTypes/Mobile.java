package typesOfDataTypes;

public class Mobile {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		int arr1[] = new int[4];
		int temp = 1,zero_count=0;
		for(int i=0;i<4;i++)
		{
			if(arr[i]!=0)
			{
				temp*=arr[i];
			}
			else
			{
				zero_count++;
			}
		}
		if(zero_count>1)
		{
			for(int i=0;i<4;i++)
			{
				arr1[i]=0;
			}
			System.out.println(arr1);
		}
		for(int j=0;j<4;j++)
		{
			
		}
	}

}
