package banking.model;

public class DepositTransaction extends Transaction {

	public DepositTransaction(double amount) {
		super(amount);
		
	}
	
	@Override
	public void update(BankAccount acc) {
		acc.deposit(getAmount());
	}
	
	

}
