package banking.test;

import banking.model.BankAccount;
import banking.model.Customer;

/**
 * Week 5 BankAccount Example: 
 * Constructors, default constructor and constructor
 * chain Customer - BankAccount relation 
 * Encapsulation Method overloading
 */
public class BankAccountTester_Week5 {

	public static void main(String[] args) {
		BankAccount.setFEE(10);//All BankAccount instances will share same fee (10 TL)
		Customer customer1 = new Customer("Ayse");
		Customer customer2 = new Customer("Eda");
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		System.out.println(account1.getFEE());//Not a good way
		System.out.println(account2.getFEE());//Not a good way
		account1.setOwner(customer1);
		account2.setOwner(customer2);
		customer1.setBankAccount(account1);
		customer2.setBankAccount(account2);
		
		System.out.println(customer1.getCustomerId());
		System.out.println(customer1.getName());

		customer1.setName("Ayse Ceren");
		System.out.println(customer1.getName());
		System.out.println(customer1.getCreateDate());

		System.out.println(customer1.getName() + " Balance:" + customer1.getBankAccount().getBalance());
		account1.deposit(1000);
		account1.withdraw(400);
		account1.deposit(100);
		System.out.println(customer1.getName() + " Balance:" + customer1.getBankAccount().getBalance());
		//BankAccount.setFEE(15.6);//Correct way
		account1.setFEE(13.6); //Not a good way. Change static field's value with using class name. Don't use instance variables
		System.out.println(account1.getFEE()); //Not a good way.
		System.out.println(account2.getFEE()); //Not a good way.
		System.out.println(BankAccount.getFEE());//Correct way
		
		
		
		
	}

}
