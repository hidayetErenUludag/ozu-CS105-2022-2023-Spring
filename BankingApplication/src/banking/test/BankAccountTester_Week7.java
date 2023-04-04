package banking.test;

import banking.model.BankAccount;
import banking.model.CheckTransaction;
import banking.model.Customer;
import banking.model.DepositTransaction;
import banking.model.Transaction;

/**

 */
public class BankAccountTester_Week7 {

	public static void main(String[] args) {
		CheckTransaction ct=new CheckTransaction(100, 123);
		System.out.println(ct.getAmount());
		System.out.println(ct.getChNumber());
		
		Transaction trx = new CheckTransaction(200, 230);
		System.out.println(trx.getAmount());
		CheckTransaction ctrx=(CheckTransaction)trx;
		System.out.println(ctrx.getChNumber());
		
		
		
	
	}

}
