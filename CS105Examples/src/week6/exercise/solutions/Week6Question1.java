package week6.exercise.solutions;


public class Week6Question1 {

	public static void main(String[] args)
	{
		// Just like how you call new int[], you will create in the same way when
		// you create an object.
		BankAccount b1 = new BankAccount("Mete", 100);
		
		System.out.println("Before deposit " + b1.money);
		b1.deposit(200);
		b1.deposit(300);
		b1.deposit(400);
		b1.deposit(500);
		System.out.println("After deposit " + b1.money);
		b1.withdraw(200);
		b1.withdraw(100);
		b1.withdraw(1500); // Here I owed to bank.

		b1.deposit(1500); // Here I went to positive.
		b1.withdraw(3000);  // Here I owed to bank again.

		System.out.println("After withdraw " + b1.money);
		
		System.out.println("How many times did I deposit money?? : "
							+ b1.getDepositCount());

		System.out.println("How many times did I withdraw money?? : "
				+ b1.getWithdrawCount());

		System.out.println("What is the maximumum amount of deposit : " + b1.getMaximumDeposit());

		System.out.println("How many times did I borrowed money : " + b1.getNegativeBalanceCount());

	}
	
}
