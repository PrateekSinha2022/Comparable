package Week4Test;

import java.util.Arrays;

public class NewDelRep {
	
	public static String dup(String s)
	{
		StringBuilder s1=new StringBuilder(s);
		StringBuilder s2=new StringBuilder();
		
		int count=0,i,j;
		
		for(i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			String m=ch+"";
			count=0;
			
			if(s2.indexOf(m)==-1)
				s2.append(m);
		}
		
		return s2.toString();
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
