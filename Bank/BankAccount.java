package Bank;

public class BankAccount {
	private double balance;
	
	public double getBalance()
	{
		return this.balance;
	}
	public void setBalance(double amount)
	{
		this.balance=amount;
	}
	
	public BankAccount deposit(double money)
	{
		this.setBalance(this.getBalance()+money);
		return this;
	}
	public BankAccount withdraw(double money)
	{
		this.setBalance(this.getBalance()-money);
		return this;
	}

}
