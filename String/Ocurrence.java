package String;

import java.util.Scanner;

public class Ocurrence {
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		String s = sc.next();
		char c=sc.next().charAt(0);
		int count =0;
		int l=s.length();
		
		for(int i=0;i<l;i++)
		{
			char ch = s.charAt(i);
			if(ch==c)
				count++;
		}
		System.out.println(count);
	}

}
