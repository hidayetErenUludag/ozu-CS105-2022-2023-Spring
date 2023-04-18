package banking.model;

import java.util.Date;

public class OwnerChange implements BankAccountUpdater{
	private Customer oldOwner;
	private Customer newOwner;
	private Date date;
	
	public OwnerChange(Customer newOwner) {
		super();
		this.newOwner = newOwner;
		this.date=new Date();
	}
	
	@Override
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}

	

	@Override
	public void update(BankAccount account) {
		this.oldOwner=account.getOwner();
		account.setOwner(newOwner);
	}

	public Customer getOldOwner() {
		return oldOwner;
	}

	public void setOldOwner(Customer oldOwner) {
		this.oldOwner = oldOwner;
	}

	public Customer getNewOwner() {
		return newOwner;
	}

	public void setNewOwner(Customer newOwner) {
		this.newOwner = newOwner;
	}

	
	
}
