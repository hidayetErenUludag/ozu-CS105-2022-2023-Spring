package banking.model;

import java.util.Date;

public interface BankAccountUpdater {
	public void update(BankAccount account); 
	public Date getDate();

}
