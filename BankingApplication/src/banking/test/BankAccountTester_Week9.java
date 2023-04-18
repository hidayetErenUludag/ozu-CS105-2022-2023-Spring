package banking.test;

import banking.model.BankAccount;
import banking.model.Customer;
import banking.model.DepositTransaction;
import banking.model.OwnerChange;
import banking.model.Transaction;

/**

 */
public class BankAccountTester_Week9 {

	public static void main(String[] args) {
		Customer customer=new Customer("Ali");
		Transaction trx1=new DepositTransaction(1000);
		
		BankAccount account=new BankAccount(customer);
		
		Customer newCust=new Customer("Berke");
		System.out.println("BEFORE:"+account.getOwner().getName()+ " Balance:"+account.getBalance());
		OwnerChange ownerChange=new OwnerChange(newCust);
		account.post(ownerChange);
		account.post(trx1);
		System.out.println("AFTER:"+account.getOwner().getName()+ " Balance:"+account.getBalance());

		


		
	
	}

}
