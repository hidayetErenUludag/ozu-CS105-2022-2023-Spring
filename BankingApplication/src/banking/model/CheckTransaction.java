package banking.model;

import banking.exception.InsufficientBalanceException;

public class CheckTransaction extends WithdrawalTransaction {
	

	private int chNumber;
	public CheckTransaction(double amount, int checkNumber) {
		super(amount);
		setChNumber(checkNumber);
		
	}
	public int getChNumber() {
		return chNumber;
	}

	private void setChNumber(int chNumber) {
		this.chNumber = chNumber;
	}
	
	@Override
	public String toString() {
		return super.toString()+" #"+chNumber;
	}
	@Override
	public void update(BankAccount acc) throws InsufficientBalanceException {
		super.update(acc);
		acc.withdraw(20);
		
	}
	
	
	
}
