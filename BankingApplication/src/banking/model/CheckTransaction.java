package banking.model;

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
	public void update(BankAccount acc) {
		super.update(acc);
		acc.withdraw(20);
		
	}
	
	
	
}
