package uem_4;

import java.util.Scanner;

public class Count {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int ecount=0,ocount=0;
		
		while(n>0)
		{
			int r=n%10;
			//System.out.println(r);
			if(r%2==0)
				ecount++;
			else
				ocount++;
			n=n/10;
		}
		System.out.println(ecount*ocount);
	}

}
