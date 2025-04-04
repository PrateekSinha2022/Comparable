package uem_4;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,i,f=1;
		a=sc.nextInt();
		for(i=1;i<=a;i++)
		{
			f*=i;
		}
		System.out.println(f);
	}
}
