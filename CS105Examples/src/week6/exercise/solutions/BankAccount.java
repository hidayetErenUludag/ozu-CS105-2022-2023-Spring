package week6.exercise.solutions;


public class BankAccount {
	// What does this mean??: It means you are reaching to class level variables/methods.
	
	// How to make a constructor???
	// public ClassName(parameters) {}
	public String name;
	public double money, maxDeposit;
	public int depositCount, withdrawCount, posToNegCount;
	
	public BankAccount(String name, double money)
	{
		// Here, in the constructor, save the parameters to class.
		this.name = name;
		this.money = money;
		
		// Assign default values.
		this.depositCount = 0;
		this.withdrawCount = 0;
		this.posToNegCount = 0;
		
		this.maxDeposit = 0.0;
	}
	
	public void deposit(double moneyAdded)
	{
		// I need to increase the money that I have.
		this.money += moneyAdded;
		this.depositCount += 1;
		
		if (moneyAdded > this.maxDeposit)
			this.maxDeposit = moneyAdded;
	}
	
	public void withdraw(double moneyWithdraw)
	{
		if (this.money > 0 && this.money - moneyWithdraw < 0)
			this.posToNegCount += 1;

		// I need to decrease the money that I have.
		this.money -= moneyWithdraw;
		this.withdrawCount += 1;
	}
	
	public int getDepositCount()
	{
		return this.depositCount;
	}

	public int getWithdrawCount()
	{
		return this.withdrawCount;
	}
	
	public double getMaximumDeposit()
	{
		return this.maxDeposit;
	}
	
	public int getNegativeBalanceCount()
	{
		return this.posToNegCount;
	}
}
