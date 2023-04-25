package banking.exception;

public class InsufficientBalanceException extends Exception {

	private static final long serialVersionUID = -6414096564938557017L;

	public InsufficientBalanceException() {
		super();
	}

	public InsufficientBalanceException(String message) {
		super(message);
	}
	

}
