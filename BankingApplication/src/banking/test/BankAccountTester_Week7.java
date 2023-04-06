package banking.test;

import banking.model.BankAccount;
import banking.model.CheckTransaction;
import banking.model.Customer;
import banking.model.DepositTransaction;
import banking.model.Transaction;
import banking.model.WithdrawalTransaction;

/**

 */
public class BankAccountTester_Week7 {

	public static void main(String[] args) {
		CheckTransaction ct=new CheckTransaction(100, 123);
//		System.out.println(ct.getAmount());
//		System.out.println(ct.getChNumber());
		
		Transaction trx1 = new CheckTransaction(200, 230);
//		System.out.println(trx1.getAmount());
		CheckTransaction ctrx=(CheckTransaction)trx1;
//		System.out.println(ctrx.getChNumber());
		
		Transaction trx2=new DepositTransaction(1000);
		Transaction trx3=new WithdrawalTransaction(300);
		
		System.out.println(trx1);
		System.out.println(trx2);
		System.out.println(trx3);
		
		
	
	}

}
