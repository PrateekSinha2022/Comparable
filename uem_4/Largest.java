package uem_4;

import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in );
		int a,b,c,greatest_no=0;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b&& a>c)
			System.out.println("A largest");
		else if(b>a && b>c)
			System.out.println("B largest");
		else
			System.out.println("C is the lar");
	}
}
