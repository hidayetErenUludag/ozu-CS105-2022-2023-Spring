package banking.test;

import banking.model.BankAccount;
import banking.model.CheckTransaction;
import banking.model.Customer;
import banking.model.DepositTransaction;
import banking.model.Transaction;
import banking.model.WithdrawalTransaction;

/**

 */
public class BankAccountTester_Week8 {

	public static void main(String[] args) {
		Transaction trx = new CheckTransaction(200, 230);
		CheckTransaction checkTrx=new CheckTransaction(100, 123);
		Transaction depositTrx=new DepositTransaction(1000);
		Transaction withTrx=new WithdrawalTransaction(300);
		BankAccount account=new BankAccount();
		
		account.post(depositTrx);
	    account.post(withTrx);
	    account.post(trx);

		
	
	}

}
