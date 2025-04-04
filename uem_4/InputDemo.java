package uem_4;

import java.util.Scanner;

public class InputDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner("12,13C++");
		sc.useDelimiter(",");
		/*while(sc.hasNextInt())
		{
			int n= sc.nextInt();
			System.out.println(n);
		}*/
		System.out.println(sc.next());
		System.out.println(sc.next());
	}

}
