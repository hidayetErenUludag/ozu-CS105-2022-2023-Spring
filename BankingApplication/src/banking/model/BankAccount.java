package banking.model;

public class BankAccount {
	private double balance=0;
	
	
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
		balance=balance+amount+amount*0.11; 
		return true;
	}
	public double checkBalance() {
		return balance;
	}
	
	
}
