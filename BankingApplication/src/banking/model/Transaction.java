package banking.model;

import java.util.Date;

public class Transaction {
	private Date date;//Encapsulation
	private double amount;//Encapsulation
	
	
	public Transaction(double amount) {
		super();
		this.amount=amount;
		this.date=new Date();
		
//		setAmount(amount);
//		setDate(new Date());
	}
	
	public Date getDate() {
		return date;
	}
	private void setDate(Date date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	private void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	

}
