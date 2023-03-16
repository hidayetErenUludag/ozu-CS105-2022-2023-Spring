package banking.test;

import banking.model.BankAccount;

public class BankAccountTester {

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
