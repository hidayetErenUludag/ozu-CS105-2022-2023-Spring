package banking.test;

import banking.model.BankAccount;
/**
 * Week 4 BankAccount Example: 
 * Create classes and objects
 * Add fields
 * add methods
 * call methods (send messages to the objects)
 */
public class BankAccountTester_Week4 {

	public static void main(String[] args) {
		BankAccount accountAyse=new BankAccount();
		accountAyse.deposit(1000);
		
		BankAccount accountEda=new BankAccount();
		accountEda.deposit(9000);
		
		accountEda.withdraw(200);
		accountAyse.withdraw(3000);
		accountEda.withdraw(500);
		
		System.out.println(accountEda.checkBalance());
		System.out.println(accountAyse.checkBalance());
	
	}

}
