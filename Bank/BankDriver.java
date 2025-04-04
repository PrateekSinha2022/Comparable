package Bank;

public class BankDriver {
	public static void main(String[] args) {
		BankAccount ob=new BankAccount();
		
		System.out.println(ob.deposit(10000).withdraw(2000).getBalance());
	}
	

}
