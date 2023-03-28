package banking.test;

import banking.model.BankAccount;
import banking.model.Customer;

/**
 * Week 5 BankAccount Example: 
 * Constructors, default constructor and constructor
 * chain Customer - BankAccount relation 
 * Encapsulation Method overloading
 */
public class BankAccountTester_Week6 {

	public static void main(String[] args) {
		//toString examples
//		Customer customer1 = new Customer(1,"Eda");
//		BankAccount account1 = new BankAccount();
//		account1.deposit(100);
//		customer1.setBankAccount(account1);
//		
//		Customer customer2 = new Customer(4,"Ece");
//		System.out.println(customer1==customer2);
//		customer2.setName("ali");
//		customer1=customer2;
//		
//		System.out.println(customer1.getName());
//		System.out.println(customer2.getName());
//		System.out.println(customer1==customer2);
		
//		System.out.println(customer1.toString());
//		System.out.println(customer2.toString());
	
		//equals examples
		Customer customer3 = new Customer(1,"Eda");	
		Customer customer4 = new Customer(1,"Eda");
		System.out.println(customer3==customer4);//false
		//false - before adding equals method
		System.out.println(customer3.equals(customer4));
		System.out.println(customer3.equals("Ali"));//false

		
	}

}
