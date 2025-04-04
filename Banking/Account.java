package Banking;

public class Account {
	
	private String name;
	private double balance;
	private long account_no;
	
	Account(String name,double balance,long account_no)
	{
		this.setAccount_no(account_no);
		this.setBalance(balance);
		this.setName(name);
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public void setAccount_no(long account_no)
	{
		this.account_no=account_no;
	}
	public String getName()
	{
		return this.name;
	}
	public double getBalance()
	{
		return this.balance;
	}
	public long getAccount_no()
	{
		return this.account_no;
	}
	
	public double check_bal()
	{
		return this.getBalance();
	}
	public boolean withdraw(int money)
	{
		if(money<=this.getBalance() && money>0)
		{
			this.setBalance(this.getBalance()-money);
			return true;
		}
		return false;
	}
	public boolean deposit(int money)
	{
		if(money>0)
		{
			this.setBalance(this.getBalance()+money);
			return true;
		}
		return false;
	}

}
