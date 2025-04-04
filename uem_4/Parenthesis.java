package uem_4;

import java.util.Scanner;

public class Parenthesis {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s = sc.next();
		int l= s.length();
		int arr[]=new int[l];
		int top=-1,i;
		for(i=0;i<l;i++)
		{
			char ch =s.charAt(i);
			if(ch=='('||ch=='['||ch=='{')
			{
				top++;
				arr[top]=ch;
			}
			else
			{
				if(ch==')'&&arr[top]!='(')
				{
					System.out.println("False");
				}
				else if(ch=='}'&&arr[top]!='{')
				{
					System.out.println("False");
				}
				
			}
		}
	}

}
