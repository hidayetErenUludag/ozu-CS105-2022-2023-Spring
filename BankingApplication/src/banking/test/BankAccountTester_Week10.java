package banking.test;

import banking.exception.InsufficientBalanceException;
import banking.model.BankAccount;
import banking.model.Customer;
import banking.model.DepositTransaction;
import banking.model.OwnerChange;
import banking.model.Transaction;
import banking.model.WithdrawalTransaction;

/**

 */
public class BankAccountTester_Week10 {

	public static void main(String[] args) throws InsufficientBalanceException {
		Customer customer=new Customer("Ali");
		BankAccount account=new BankAccount(customer);
		System.out.println("Balance:"+account.getBalance());
		
		Transaction trx1=new DepositTransaction(1000);
		account.post(trx1);
		System.out.println("Balance:"+account.getBalance());
		
		Transaction trx2=new WithdrawalTransaction(3000);
		account.post(trx2);
		
		System.out.println("Balance:"+account.getBalance());

		


		
	
	}

}
