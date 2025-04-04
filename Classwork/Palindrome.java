package Classwork;

public class Palindrome {
	
	static boolean isPlain(String s)
	{
		String s1="";
		//System.out.println(s);
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			s1=ch+s1;
		}
		
		if(s.equals(s1))
		{
			//System.out.println(s1);
			return true;
		}
			
		return false;
	}

}
