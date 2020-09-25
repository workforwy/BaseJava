package chapter15_exception;

public class WrongPasswordExpcetion extends Exception {

	public WrongPasswordExpcetion() {
		super();
		  
	}

	public WrongPasswordExpcetion(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		  
	}

	public WrongPasswordExpcetion(String message, Throwable cause) {
		super(message, cause);
		  
	}

	public WrongPasswordExpcetion(String message) {
		super(message);
		  
	}

	public WrongPasswordExpcetion(Throwable cause) {
		super(cause);
		  
	}



}
