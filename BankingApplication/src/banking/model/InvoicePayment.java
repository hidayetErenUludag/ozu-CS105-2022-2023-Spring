package banking.model;

public class InvoicePayment extends WithdrawalTransaction {
    private String invoiceNumber;
    
	public InvoicePayment(double amount) {
		super(amount);
	}


	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

}
