package uem_4;

import java.util.Scanner;

public class Check {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		char ch;
		System.out.println("Enter 2 numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter an operator");
		ch = sc.next().charAt(0);
		
		if(ch=='+')
		{
			System.out.println(a+b);
		}
		else if(ch=='-')
		{
			System.out.println(a-b);
		}
		else if(ch=='*')
		{
			System.out.println(a*b);
		}
		else if(ch=='/') {
			System.out.println(a/b);
		}
		else
			System.out.println("Invalid char");
	}

}
