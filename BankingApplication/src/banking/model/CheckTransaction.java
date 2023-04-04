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
}
