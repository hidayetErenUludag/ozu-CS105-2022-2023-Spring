package banking.model;

import java.text.ParseException;

import banking.exception.InsufficientBalanceException;

public class WithdrawalTransaction extends Transaction {

	public WithdrawalTransaction(double amount) {
		super(amount);
	}

	@Override
	public void update(BankAccount acc) throws InsufficientBalanceException  {
		acc.withdraw(getAmount());
	}
}
