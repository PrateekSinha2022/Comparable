package String;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		String s = sc.next();
		String s1="";
		int l=s.length();
		
		for(int i=0;i<l;i++)
		{
			char ch = s.charAt(i);
			s1=ch+s1;
		}
		
		if(s.equals(s1))
			System.out.println(true);
		else
			System.out.println(false);
	}

}
