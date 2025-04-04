package uem_4;

import java.util.Scanner;

public class Rev {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int rev=0;
		while(n>0)
		{
			int r=n%10;
			n/=10;
			rev=rev*10+r;
		}
		System.out.println(rev);
	}

}
