package uem_4;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		int f=n;
		int l= (n+"").length();
		int no=0;
		int k=f;
		while(f>0)
		{
			int r=f%10;
			f=f/10;
			no+=(int)Math.pow(r, l);
		}
		if(no==k)
			System.out.println("Armstrong");
		else
			System.out.println("Not armstrong");
	}

}
