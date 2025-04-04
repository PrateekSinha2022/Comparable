package Str;

import java.util.Scanner;

public class Main {
	
	public static int countPalin(String s)
	{
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			count+=find(s,i,i);
			count+=find(s,i,i+1);
		}
		return count;
	}
	
	public static int find(String s,int left,int right)
	{
		int count=0;
		while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
		{
			count++;
			left--;
			right++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int a = countPalin(s);
		System.out.println("The count is "+a);
	}

}
