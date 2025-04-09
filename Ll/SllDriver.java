package Ll;

import java.util.Scanner;

public class SllDriver {
	public static void main(String[] args) {
		
		Sll list=new Sll();
		list.apppend(10);
		list.apppend(20);
		list.apppend(30);
		list.prepend(60);
		list.prepend(70);
		list.display();
		
		/*Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int val=sc.nextInt();
		
		if(n>=list.getSize())
			list.apppend(val);
		else if(n<=0)
			list.prepend(val);
		else
			list.insert(val, n);
		
		list.deleteIndex(4);*/
		list.reverse();
		list.update(2,500 );
		list.display();
		
		System.out.println(list.get(1));
		
		
	}

}
