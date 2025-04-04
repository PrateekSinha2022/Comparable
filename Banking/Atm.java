package Banking;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.nextLine();
		//sc.next();
		System.out.println("Enter account no");
		long account_no=sc.nextLong();
		System.out.println("Enter initial balance");
		double balance=sc.nextDouble();
		
		Account account=new Account(name,balance,account_no);
		
		System.out.println("Welocme "+account.getName());
		
		while(true)
		{
			System.out.println("Enter 1 to check balance\nEnter 2 to deposit\nEnter 3 to withdraw\nEnter 4 to exit");
			int ch =sc.nextInt();
			
			switch(ch)
			{
			case 1: double bal=account.check_bal();
			System.out.println("Balance = "+bal);
			break;
			case 2: System.out.println("Enter amount to deposit");
			int amount=sc.nextInt();
			boolean res = account.deposit(amount);
			if(res==true)
				System.out.println("deposit successful");
			else
				System.out.println("deposit unsuccessful");
			break;
			case 3: System.out.println("Enter amount to withdraw");
			int withdraw=sc.nextInt();
			boolean result = account.withdraw(withdraw);
			if(result==true)
				System.out.println("Withdraw successful");
			else
				System.out.println("withdraw unsuccessful");
			break;
			case 4: System.exit(0);
			}
		}
	}

}
