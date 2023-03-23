package banking.model;

import java.util.Date;

public class BankAccount {
	private static double FEE;
	private static double INTEREST_RATE=0.11;
	private double balance=0;
	private long accountId=(long)(Math.random()*100000);
	private Date createDate=new Date();
	private Customer owner;
	
	
	
	public double withdraw(double amount) {
		
		if(amount+10>balance) {
			System.out.println("Insufficient Balance. "
					+ "Your balance is:"+balance);
			return 0;
		}else {
			balance=balance-amount-10;
			return amount;
		}
	}
	
	public boolean deposit(double amount) {
		balance=balance+amount+amount*INTEREST_RATE; 
		return true;
	}
	
	public double getBalance() {
		return balance;
	}

	private void setBalance(double balance) {
		this.balance = balance;
	}

	public long getAccountId() {
		return accountId;
	}

	private void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	private void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Customer getOwner() {
		return owner;
	}

	public void setOwner(Customer owner) {
		this.owner = owner;
	}

	public static double getFEE() {
		return FEE;
	}

	public static void setFEE(double fEE) {
		FEE = fEE;
	}
	
	
}
