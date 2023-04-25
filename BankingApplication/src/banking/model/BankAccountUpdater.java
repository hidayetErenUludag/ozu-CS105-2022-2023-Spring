package banking.model;

import java.util.Date;

import banking.exception.InsufficientBalanceException;

public interface BankAccountUpdater {
	public void update(BankAccount account) throws InsufficientBalanceException; 
	public Date getDate();

}
