package uem_4;

import java.util.Scanner;

public class Palindrome {
	public boolean isPalin(int n)
	{
		int f = n;
		int rev=0;
		while(n>0)
		{
			int r=n%10;
			n/=10;
			rev=rev*10+r;
		}
		if(rev==f)
			return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int no=sc.nextInt();
		Palindrome ob = new Palindrome();
		boolean res=ob.isPalin(no);
		if(res==true)
			System.out.println("Plaindrome");
		else
			System.out.println("Not Plaindrome");
	}

}
