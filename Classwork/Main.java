package Classwork;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s=sc.next();
		
		String s1="";
		int c=0;
		
		for(int i=0;i<s.length();i++)
		{
			s1="";
			for(int j=i;j<s.length();j++)
			{
				char ch = s.charAt(j);
				s1=s1+ch;
				//System.out.println(s1);
				
				if(Palindrome.isPlain(s1))
					c++;
			}
		}
		
		System.out.println("The count is "+c);
	}

}
