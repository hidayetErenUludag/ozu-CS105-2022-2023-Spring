package banking.model;

import java.util.Date;
import java.util.Objects;

public class Customer {
	private long customerId;
	private String name;
	private BankAccount bankAccount;
	private Date createDate;

	public Customer(String name) {
		this();
		this.name = name;
	}

	public Customer(long id, String name) {
		this.customerId = id;
		this.name = name;
	}

	public Customer() {
		//this.customerId=(long)(Math.random()*100000);
		setCustomerId((long) (Math.random() * 100000));
		this.createDate = new Date();

	}

	public long getCustomerId() {
		return customerId;
	}

	private void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public Date getCreateDate() {
		return createDate;
	}

	private void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		// return "Customer Info: [ID=>"+customerId+" Name=>"+name+"]";
		if (bankAccount != null)
			return "Name:" + getName() + " Balance:" + bankAccount.getBalance();
		else
			return "Name:" + getName();
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return customerId == other.customerId;
	}

}
