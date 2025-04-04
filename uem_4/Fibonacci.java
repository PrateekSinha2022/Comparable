package uem_4;

import java.util.Scanner;

public class Fibonacci {
	public void fibo(int n)
	{
		int a=0,b=1,z=0;
		if(n==1)
			System.out.println(a);
		else if(n==2)
			System.out.println(a+","+b);
		else
		{
			System.out.print(a);
			int i=2;
			while(i<=n)
			{
				z=a+b;
				b=a;
				a=z;
				System.out.print(","+z);
				i++;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		Fibonacci ob=new Fibonacci();
		ob.fibo(n);
	}

}
