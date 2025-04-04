package ManyToMany;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String names[]= {"Java","Python","C"};
		
		Subject[] sub = new Subject[3];
		
		int i=0,k=1;
		
		while(i<3)
		{
			Subject subject = new Subject(names[i]);
			sub[i]=subject;
			System.out.println("Eneter names for subjects "+names[i]);
			do
			{
				//System.out.println("Enter name");
				String s =sc.next();
				subject.addStudent(s);
				System.out.println("To exit press 0");
				int n=sc.nextInt();
				if(n==0)
				{
					k=0;
				}
			}while(k!=0);
			
			i++;
		}
		
		i=0;
		while(i<3)
		{
			sub[i].display();
			i++;
		}
	}
		


}
