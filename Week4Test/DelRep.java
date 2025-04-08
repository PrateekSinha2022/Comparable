package Week4Test;

import java.util.Arrays;

public class DelRep {
	
	public static String dup(String s)
	{
		StringBuilder s1=new StringBuilder();
		boolean arr[]=new boolean[256];
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			arr[ch]=false;
		}
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(arr[ch]==false)
			{
				arr[ch]=true;
				s1.append(ch);
			}
		}
		return s1.toString();
	}
	
	public static void main(String[] args) {
		
		String []arr= {"apple","Banana","cherry"};
		
		int i;
		for(i=0;i<3;i++)
		{
			arr[i]=dup(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
	}

}
